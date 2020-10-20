package 课堂练习05.java;

import java.util.List;

public interface SctuSpider {
    //下载HTML文件
    String downloadHtml(String url);
    //提取重要的信息
    List<Article> parseHtml(String html);
    //提取的信息保存到txt文件
    void saveToTxtFile(List<Article> articleList,String filepath);
    //面向用户的方法
    void collectArticle(String url, String filePath);

}
