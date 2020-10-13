package edu.sctu.java.day1010;

import edu.sctu.java.day0929.ListTest;

import java.util.List;

public interface SctuSpider {
    //下载html文件
    void downloadHtml(String url);
    //提取需要的信息
    ListTest<Article> parseHtml(String html);
    //提取的信息保存到txt文件
    void saveToTxtFile(List<Article> articleList,String filePath);
//    提供一个用户友好的方法
    void collectArticles(String url,String filePath);
}
