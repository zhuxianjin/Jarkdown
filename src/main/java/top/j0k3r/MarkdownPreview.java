package top.j0k3r;

import javax.swing.*;
import java.awt.*;

/**
 * markdown html 预览类
 */

class MarkdownPreview {

    public static JEditorPane jep = new JEditorPane();

    //构造函数初始化
    public MarkdownPreview(Container contentPane, String html){

        jep.setEditable(false);
        jep.setPreferredSize(new Dimension(500, 800));

        try {
            jep.setContentType("text/html");
            jep.setText(html);
        } catch (Exception e) {
            e.printStackTrace();
        }


        JScrollPane scrollPane = new JScrollPane(jep);

        contentPane.add(scrollPane,BorderLayout.EAST);
    }

    // 更新 markdown 预览内容
    public static void markdownPreviewUpdate(String html){
        try {
            jep.setContentType("text/html");
            jep.setText(html);
            jep.validate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}