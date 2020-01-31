package top.j0k3r;

import java.io.*;
import com.alibaba.fastjson.*;

/**
 * 配置文件类
 */

public class JarkdownConfig {

    public static String jsonConfigFileName = "JarkdownConfig.json";

    public JarkdownConfig(){}

    public static boolean isExcite(String filePath) {
        File file = new File(filePath);
        // 如果文件夹不存在则创建
        if (!file.exists() && !file.isDirectory()) {
            return false;
        } else {
            return true;
        }
    }

    public static String readToString(String fileName) {
        String encoding = "UTF-8";
        File file = new File(fileName);
        Long filelength = file.length();
        byte[] filecontent = new byte[filelength.intValue()];
        try {
            FileInputStream in = new FileInputStream(file);
            in.read(filecontent);
            in.close();
            return new String(filecontent, encoding);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
        }
    }

    public void loadSetting() throws IOException {
        if (isExcite(jsonConfigFileName) == true){
            String setting;
            setting = readToString(jsonConfigFileName);
            System.out.println(setting);
        }
        else {
            String jsonConfig = initSetting();
            initJsonConfigFile(jsonConfig);
        }
    }

    public String initSetting(){
        String jsonConfig;
        JSONObject setting = new JSONObject();
        setting.put("VERSION","1.0");
        setting.put("ARTICLE",0);
        setting.put("IS_APP_INIT",true);
        setting.put("NOW_FILE","");
        setting.put("NOW_CSS_THEME","theme_1");
        setting.put("NOW_COLOR","Gray");
        jsonConfig = setting.toJSONString();
        //System.out.println(jsonConfig);
        return jsonConfig;

    }
    // 创建json配置文件
    public static void initJsonConfigFile(String jsonConfig) throws IOException {
        File newFile = new File(jsonConfigFileName);
        OutputStream newFileOut = new FileOutputStream(newFile);
        OutputStreamWriter writer = new OutputStreamWriter(newFileOut, "UTF-8");
        // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk
        writer.append(jsonConfig);
        // 写入到缓冲区
        writer.close();
        // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉
        newFileOut.close();
        // 关闭输出流,释放系统资源
    }


    // 设置当前文件名到配置文件
    public static void setCurrentFileConfig(String MarkdownFileName) throws IOException {
        String setting;
        setting = readToString(jsonConfigFileName);
        System.out.println(setting);

        JSONObject object = JSONObject.parseObject(setting);
        //string
        String s = object.getString("NOW_FILE");
        System.out.println(s);

        object.put("NOW_FILE",MarkdownFileName);
        initJsonConfigFile(object.toJSONString());

    }

    // 获取某 String 值
    public static String getCurrentStrConfig(String config){
        String setting;
        setting = readToString(jsonConfigFileName);
        JSONObject object = JSONObject.parseObject(setting);
        String s = object.getString(config);
        return s;
    }

    // 设置某 String 配置
    public static void setCurrentStrConfig(String configName, String config) throws IOException {
        String setting;
        setting = readToString(jsonConfigFileName);
        System.out.println(setting);

        JSONObject object = JSONObject.parseObject(setting);
        object.put(configName,config);
        initJsonConfigFile(object.toJSONString());
    }
}
