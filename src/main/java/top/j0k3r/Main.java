/**
 * @name: Jarkdown
 * @author: 朱先进
 * @个人博客: j0k3r.top
 * @time: 2019.12.11
 */

package top.j0k3r;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.BadLocationException;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import top.j0k3r.MarkdownFile;
import top.j0k3r.JarkdownConfig;
import top.j0k3r.MarkdownPreview;
import top.j0k3r.MarkdownText;
import top.j0k3r.Conversion;

/**
 * 主类，用于启动程序
 */

public class Main {
    public static void main(String []args) throws IOException {
        String initFileName = "newJarkdownFile";    //初始化默认文件名
        new JarkdownConfig().loadSetting(); //加载程序配置文件，并加载配置
        new MarkdownFile().writeMarkdownFile(initFileName); //默认文件初始化
        new GUI(initFileName);  //建立用户界面供用户操作
    }
}

/**
 * 创建GUI用户界面
 */

class GUI extends JFrame implements ItemListener, ActionListener {
    public static JComboBox colorComboBox = new JComboBox();
    public GUI(final String iniFileName) {
        //设置显示窗口标题
        setTitle("Jarkdown");

        //设置窗口显示尺寸
        //setSize(500,500);
        setBounds(100, 100, 1020, 700);

        //置窗口是否可以关闭
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //获取窗体容器
        final Container c = getContentPane();

        //设置背景颜色
        c.setBackground(Color.gray);

        //设置布局
        c.setLayout(new BorderLayout());

        //创建组件
        final JLabel title = new JLabel("当前编辑: " + JarkdownConfig.getCurrentStrConfig("NOW_FILE")); // jabel 标签
        title.setPreferredSize(new Dimension(200, 18));
        colorComboBox.addItem("Gray");
        colorComboBox.addItem("Red");
        colorComboBox.addItem("Blue");
        colorComboBox.addItem("Yellow");
        colorComboBox.addItem("White");
        colorComboBox.addItemListener(this);
        JMenuBar mBar = new JMenuBar(); // 菜单栏
        JMenu sMenu, gMenu, geMenu, cMenu, bMenu, geCssMenu; // 添加菜单栏
        sMenu = new JMenu("Jarkdown");
        gMenu = new JMenu("工具");
        geMenu = new JMenu("格式");
        cMenu = new JMenu("搜索");
        bMenu = new JMenu("帮助");
        geCssMenu = new JMenu("CSS主题");
        final JMenuItem sItem, cItem, tItem, foItem, finItem;  // Jardown 选项菜单
        sItem = new JMenuItem("关于 Jarkdown");
        foItem = new JMenuItem("打开文件");
        finItem = new JMenuItem("保存当前文件");
        cItem = new JMenuItem("刷新");
        tItem = new JMenuItem("退出");
        JMenuItem htmlItem, pdfItem;
        htmlItem = new JMenuItem("导出为HTML");
        pdfItem = new JMenuItem("导出为PDF");
        final JMenuItem th1Item, th2Item; // css 主题
        th1Item = new JMenuItem("theme_1");
        th2Item = new JMenuItem("theme_2");
        JMenuItem lItem;
        lItem = new JMenuItem("搜索");
        JMenuItem gyItem;
        gyItem = new JMenuItem("关于");
        //panel.setLayout(new GridLayout(3,3,50,50));

        // 设置菜单栏
        setJMenuBar(mBar);
        setResizable(true);
        mBar.add(sMenu);
        mBar.add(gMenu);
        geMenu.add(geCssMenu);
        mBar.add(geMenu);
        mBar.add(cMenu);
        mBar.add(bMenu);

        // 设置选项菜单
        sMenu.add(sItem);
        sMenu.addSeparator();
        sMenu.add(foItem);
        sMenu.addSeparator();
        sMenu.add(finItem);
        sMenu.addSeparator();
        sMenu.add(cItem);
        sMenu.addSeparator();
        sMenu.add(tItem);

        // 设置 css主题选项
        geCssMenu.add(th1Item);
        geCssMenu.add(th2Item);

        // 工具添加选项菜单
        gMenu.add(htmlItem);
        gMenu.addSeparator();
        gMenu.add(pdfItem);

        // 搜索添加选项菜单
        cMenu.add(lItem);

        // 帮助添加选项菜单
        bMenu.addSeparator();
        bMenu.add(gyItem);

        // 设置菜单触发事件
        sItem.addActionListener(new ActionListener() {  // 关于 Jarkdown

            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = new JDialog();
                dialog.setBounds(300, 200, 300, 300);
                Container dc = dialog.getContentPane();
                dc.setBackground(Color.white);
                dc.setLayout(new FlowLayout());
                dc.add(new JLabel("<html><body><h1>Jarkdown 2019</h1><br><p>Version: 1.0</p><br><p>Author: 朱先进</p><br><p>Built: 2019.12.11</p><br><p>Power by <a href='https://github.com/alibaba/fastjson'>fastjson</a>, <a href='https://github.com/atlassian/commonmark-java'>commonmark-java</a></p></body></html>"));
                dc.validate();
                dialog.setVisible(true);
            }
        });

        foItem.addActionListener(new ActionListener() {  // 打开文件

            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                if (chooser.showOpenDialog(foItem) == JFileChooser.APPROVE_OPTION) {
                    File file = chooser.getSelectedFile();
                    //textArea.setText(file.getName()+":"+file.getPath()+"\n"+file.length());
                    MarkdownFile.readFile(file);
                    MarkdownText.flushPreview(MarkdownText.jta.getText()); // 获取当前文本区内容进行渲染
                    try {
                        // 获取打开文件的文件名
                        JarkdownConfig.setCurrentFileConfig(file.toString().substring(file.toString().lastIndexOf(File.separator) + 1, file.toString().lastIndexOf(".")));
                        title.setText("当前编辑: " + JarkdownConfig.getCurrentStrConfig("NOW_FILE"));
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                ;
            }
        });

        finItem.addActionListener(new ActionListener() {  // 保存当前文件

            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                if (chooser.showSaveDialog(finItem) == JFileChooser.APPROVE_OPTION) {
                    File file = chooser.getSelectedFile();
                    try {
                        MarkdownFile.saveFile(file.getPath());
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });


        cItem.addActionListener(new ActionListener() {  // 刷新

            @Override
            public void actionPerformed(ActionEvent e) {
                MarkdownText.flushPreview(MarkdownText.jta.getText()); // 获取当前文本区内容进行渲染
            }
        });

        tItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int i = JOptionPane.showConfirmDialog(null, "是否真的退出系统",
                        "退出确认对话框", JOptionPane.YES_NO_CANCEL_OPTION);
                //通过对话框中按钮的选择来决定结果，单机yes时，窗口直接消失
                if (i == 0)
                    dispose();

            }
        });

        gyItem.addActionListener(new ActionListener() {  // 关于

            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = new JDialog();
                dialog.setBounds(300, 200, 300, 300);
                Container dc = dialog.getContentPane();
                dc.setBackground(Color.white);
                dc.setLayout(new FlowLayout());
                dc.add(new JLabel("<html><body><h1>Jarkdown 2019</h1><br><p>Version: 1.0</p><br><p>Author: 朱先进</p><br><p>Built: 2019.12.11</p><br><p>Power by <a href='https://github.com/alibaba/fastjson'>fastjson</a>, <a href='https://github.com/atlassian/commonmark-java'>commonmark-java</a></p></body></html>"));
                dc.validate();
                dialog.setVisible(true);
            }
        });


        htmlItem.addActionListener(new ActionListener() {  // 导出为html

            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                if (chooser.showSaveDialog(finItem) == JFileChooser.APPROVE_OPTION) {
                    File file = chooser.getSelectedFile();
                    try {
                        MarkdownFile.saveHtmlFile(file.getPath());
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        th1Item.addActionListener(new ActionListener() {  // theme_1 css 主题

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JarkdownConfig.setCurrentStrConfig("NOW_CSS_THEME", "theme_1");
                    //MarkdownText.flush(MarkdownText.jta.getText());
                    MarkdownText.flushPreview(MarkdownText.jta.getText()); // 获取当前文本区内容进行渲染
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        th2Item.addActionListener(new ActionListener() {  // theme_2 css 主题

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JarkdownConfig.setCurrentStrConfig("NOW_CSS_THEME", "theme_2");
                    MarkdownText.flushPreview(MarkdownText.jta.getText()); // 获取当前文本区内容进行渲染
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        lItem.addActionListener(new ActionListener() {  //

            @Override
            public void actionPerformed(ActionEvent e) {
                final JDialog dialog = new JDialog();
                dialog.setBounds(300, 200, 300, 100);
                Container dc = dialog.getContentPane();
                dc.setBackground(Color.white);
                dc.setLayout(new FlowLayout());
                final JTextField input = new JTextField();
                JButton searchBut = new JButton("搜索");
                input.setPreferredSize(new Dimension(200, 30));
                dc.add(new JLabel("搜索:"));
                dc.add(input);
                dc.add(searchBut);
                searchBut.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //System.out.println("gogoogog search");
                        MarkdownText.jta.setCaretPosition(MarkdownText.jta.getText().indexOf(input.getText()));
                        int line = 0;
                        try {
                            line = MarkdownText.jta.getLineOfOffset(MarkdownText.jta.getText().indexOf("aaa"));
                        } catch (BadLocationException ex) {
                            ex.printStackTrace();
                        }
                        int h = line * (MarkdownText.jta.getHeight() / MarkdownText.jta.getLineCount()) - (MarkdownText.jscrollPane.getHeight() / 2);
                        MarkdownText.jscrollPane.getVerticalScrollBar().setValue(h);
                        //c.validate();
                        //System.out.println("gogoogog search");
                    }
                });
                dc.validate();
                dialog.setVisible(true);
            }
        });

        //JButton b = new JButton("TEST");
        //JButton b = new JButton("b1");
        //JButton b2 = new JButton("b2");
        //JButton b3 = new JButton("b3");
        //c.add(b,BorderLayout.SOUTH);
        //c.add(b2,BorderLayout.CENTER);
        //c.add(b3,BorderLayout.WEST);

        MarkdownText martex = new MarkdownText(c);
        MarkdownPreview marpre = new MarkdownPreview(c, "<html><h1>test 测试</h1><li>123</li><br><img src='file:/Users/xc/Downloads/Jarkdown/1.jpg' width='150' height='150'></html>");

        //设置组件
        //tf.setHorizontalAlignment(JTextField.LEFT);
        //b.setBounds(400,20,200,200);

        //添加组件
        JPanel theNoth = new JPanel();
        theNoth.setLayout(new FlowLayout());
        theNoth.setPreferredSize(new Dimension(1020, 20));
        colorComboBox.setPreferredSize(new Dimension(100, 17));
        theNoth.add(title);
        theNoth.add(colorComboBox);
        c.add(theNoth, BorderLayout.NORTH);
        //c.add(title,BorderLayout.NORTH);
        //c.add(colorComboBox,BorderLayout.NORTH);

        //使添加组件生效
        c.validate();
        //setContentPane(c);

        //设置窗口是否可见
        setVisible(true);

        //this.pack();

        // 窗口关闭监听
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int result = JOptionPane.showConfirmDialog(null, "是否要退出？", "退出确认", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (result == JOptionPane.YES_OPTION) {
                    System.exit(0);
                } else {
                    //nothing
                }
            }
        });


    }

    public void itemStateChanged(ItemEvent e)
    {
        if(e.getStateChange() == ItemEvent.SELECTED){
            if(colorComboBox.getSelectedItem()=="Gray") {
                MarkdownText.jta.setBackground(Color.GRAY);
                try {
                    JarkdownConfig.setCurrentStrConfig("NOW_COLOR","Gray");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if(colorComboBox.getSelectedItem()=="Red") {
                MarkdownText.jta.setBackground(Color.RED);
                try {
                    JarkdownConfig.setCurrentStrConfig("NOW_COLOR","Red");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if(colorComboBox.getSelectedItem()=="Blue") {
                MarkdownText.jta.setBackground(Color.BLUE);
                try {
                    JarkdownConfig.setCurrentStrConfig("NOW_COLOR","Blue");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if(colorComboBox.getSelectedItem()=="Yellow") {
                MarkdownText.jta.setBackground(Color.YELLOW);
                try {
                    JarkdownConfig.setCurrentStrConfig("NOW_COLOR","Yellow");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if(colorComboBox.getSelectedItem()=="White") {
                MarkdownText.jta.setBackground(Color.WHITE);
                try {
                    JarkdownConfig.setCurrentStrConfig("NOW_COLOR","White");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
