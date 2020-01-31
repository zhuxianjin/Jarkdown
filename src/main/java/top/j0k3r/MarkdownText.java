package top.j0k3r;

import javax.swing.*;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Arrays;

import org.commonmark.Extension;
import org.commonmark.node.*;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
import top.j0k3r.MarkdownFile;
import org.commonmark.ext.gfm.tables.TablesExtension;
import top.j0k3r.Conversion;
import top.j0k3r.PreviewCss;
import javax.swing.text.Document;


/**
 * markdown 编辑类
 */

public class MarkdownText {

    public static JTextArea jta = new JTextArea(40, 50);
    public static JScrollPane jscrollPane = new JScrollPane(jta);


    public MarkdownText(Container contentPane){
        String color;
        color = JarkdownConfig.getCurrentStrConfig("NOW_COLOR");
        jta.setTabSize(4);
        jta.setBounds(0,0,450,450);
        jta.setFont(new Font("楷体", Font.BOLD, 16));
        jta.setLineWrap(true);// 激活自动换行功能
        jta.setWrapStyleWord(true);// 激活断行不断字功能
        if ("Gray".equals(color)) {
            jta.setBackground(Color.GRAY);
        } else if ("Red".equals(color)) {
            jta.setBackground(Color.RED);
        } else if ("Blue".equals(color)) {
            jta.setBackground(Color.BLUE);
        } else if ("Yellow".equals(color)) {
            jta.setBackground(Color.YELLOW);
        } else if ("White".equals(color)) {
            jta.setBackground(Color.WHITE);
        } else {
            jta.setBackground(Color.GRAY);
        }
        jta.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e)
            {
                //if(e.getKeyCode()==KeyEvent.VK_ENTER){
                String currentContent = jta.getText();
                if(e.getKeyCode() > 0){
                    // 刷新预览
                    flushPreview(currentContent);
                    //保存文件
                    try {
                        MarkdownFile.saveCurrentMarkdownFile(currentContent);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        //JScrollPane jscrollPane = new JScrollPane(jta);
        contentPane.add(jscrollPane, BorderLayout.CENTER);
    }

    public static String Render2Html(String text){

        Parser parser = Parser.builder().build();
        Node document = parser.parse(text);
        // 实现回车一次就换行
        HtmlRenderer renderer = HtmlRenderer.builder().softbreak("<br/>").build();

/*        List<Extension> extensions = Arrays.asList(TablesExtension.create());
        Parser parser = Parser.builder().extensions(extensions).build();
        Node document = parser.parse(text);
        HtmlRenderer renderer = HtmlRenderer.builder().extensions(extensions).softbreak("<br/>").build();*/

        // 渲染为html
        String html = renderer.render(document);

        // 对原始html进行美化
        String title = JarkdownConfig.getCurrentStrConfig("NOW_FILE"); //获取title，即文件名（这里做去后缀处理）
        // 获取 css 配置
        //String themeName = JarkdownConfig.getCurrentStrConfig("NOW_CSS_THEME");
        // 添加 css，默认使用 theme_1
        //html = Conversion.htmlHead + "<title>" + title + "</title>\n" + PreviewCss.getTheme(themeName) + html;
        //html = html + Conversion.htmlEnd; // 添加html尾部标签

        HTMLEditorKit kit = new HTMLEditorKit();
        MarkdownPreview.jep.setEditorKit(kit);
        StyleSheet styleSheet = kit.getStyleSheet();
        String themeName = JarkdownConfig.getCurrentStrConfig("NOW_CSS_THEME");
        styleSheet.addRule(PreviewCss.getTheme(themeName));
        Document doc = kit.createDefaultDocument();
        MarkdownPreview.jep.setDocument(doc);

        return html;
    }

    public static String save2Html(String text){

        Parser parser = Parser.builder().build();
        Node document = parser.parse(text);
        // 实现回车一次就换行
        HtmlRenderer renderer = HtmlRenderer.builder().softbreak("<br/>").build();

        // 渲染为html
        String html = renderer.render(document);

        // 对原始html进行美化
        String title = JarkdownConfig.getCurrentStrConfig("NOW_FILE"); //获取title，即文件名（这里做去后缀处理）
        // 获取 css 配置
        String themeName = JarkdownConfig.getCurrentStrConfig("NOW_CSS_THEME");
        // 添加 css，默认使用 theme_1
        html = Conversion.htmlHead + "<title>" + title + "</title>\n<style>" + PreviewCss.getTheme(themeName) + "\n</style>\n" + html;
        html = html + Conversion.htmlEnd; // 添加html尾部标签

        return html;
    }

    public static void flushPreview(String currentContent){

        System.out.println(currentContent);

        String html = Render2Html(currentContent);;

        System.out.println(html);

        // 预览html
        MarkdownPreview.markdownPreviewUpdate(html);
    }

    // 获取渲染后的 html

    public static String getHtml(){

        String html = save2Html(jta.getText());
        return html;

    }

}