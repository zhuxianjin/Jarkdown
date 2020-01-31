package top.j0k3r;

import java.io.*;
import top.j0k3r.JarkdownConfig;
import com.alibaba.fastjson.*;

/**
 * Markdown 文件类
 */

public class MarkdownFile {

    /*两种构造方法,默认或指定文件名*/

/*        public MarkdownFile() throws IOException {
            File newFile = new File("newFile.md");
            OutputStream newFileOut = new FileOutputStream(newFile);
            OutputStreamWriter writer = new OutputStreamWriter(newFileOut, "UTF-8");
            // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk

            writer.append("# title ");
            // 写入到缓冲区

            writer.append("\r\n");
            // 换行

            writer.append("> 测试内容");
            // 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入

            writer.close();
            // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉

            newFileOut.close();
            // 关闭输出流,释放系统资源
        }*/

    // 构造执行文件名称的文件

    public void writeMarkdownFile(String fileName) throws IOException {
        File newFile = new File(fileName);
        OutputStream newFileOut = new FileOutputStream(newFile);
        OutputStreamWriter writer = new OutputStreamWriter(newFileOut, "UTF-8");
        // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk

        writer.append("# title ");
        // 写入到缓冲区

        writer.append("\r\n");
        // 换行

        writer.append("> 测试内容");
        // 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入

        writer.close();
        // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉

        newFileOut.close();
        // 关闭输出流,释放系统资源

        // 设置当前文件名到配置文件
        JarkdownConfig.setCurrentFileConfig(fileName);
    }

    public static void writeFile(String fileName,String fileContent) throws IOException {
        File newFile = new File(fileName);
        OutputStream newFileOut = new FileOutputStream(newFile);
        OutputStreamWriter writer = new OutputStreamWriter(newFileOut, "UTF-8");
        // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk

        writer.append(fileContent);
        // 写入到缓冲区
        writer.close();
        // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉
        newFileOut.close();
        // 关闭输出流,释放系统资源
    }

    public static void saveFile(String fileName) throws IOException {  //保存文件
        File newFile = new File(fileName);
        OutputStream newFileOut = new FileOutputStream(newFile);
        OutputStreamWriter writer = new OutputStreamWriter(newFileOut, "UTF-8");
        // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk

        writer.append(MarkdownText.jta.getText());
        // 写入到缓冲区
        writer.close();
        // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉
        newFileOut.close();
        // 关闭输出流,释放系统资源
    }

    public static void saveHtmlFile(String fileName) throws IOException {  //保存文件
        File newFile = new File(fileName);
        OutputStream newFileOut = new FileOutputStream(newFile);
        OutputStreamWriter writer = new OutputStreamWriter(newFileOut, "UTF-8");
        // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk

        writer.append(MarkdownText.getHtml());
        // 写入到缓冲区
        writer.close();
        // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉
        newFileOut.close();
        // 关闭输出流,释放系统资源
    }

    public static void readFile(File file){  //读文件
        BufferedReader bReader;
        try {
            bReader=new BufferedReader(new FileReader(file));
            StringBuffer sBuffer=new StringBuffer();
            String str;
            while((str=bReader.readLine())!=null){
                sBuffer.append(str+'\n');
                //System.out.println(str);
            }
            MarkdownText.jta.setText(sBuffer.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveCurrentMarkdownFile(String currentContent) throws IOException {
        //获取当前配置
        String setting;
        setting = JarkdownConfig.readToString(JarkdownConfig.jsonConfigFileName);
        JSONObject object = JSONObject.parseObject(setting);
        String currentFile = object.getString("NOW_FILE");
        System.out.println(currentFile);
        writeFile(currentFile,currentContent);

    }
}
