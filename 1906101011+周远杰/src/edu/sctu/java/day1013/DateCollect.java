package edu.sctu.java.day1013;

import java.util.List;

public interface DateCollect {

    //把网页下载到本地
    Object downlodeHtml(String url);

    //提取html文件想要内容
    List<Article> parseHtml(String html);

    //将提取信息保存在txt文件
    String saveToTxtFile(List<Article> articleList,String  filePath);

    //提供一个用户友好的办法
    void collectArticles(String url,String filePath);
}
