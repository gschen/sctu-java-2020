package edu.sctu.java.day1013;

import java.util.List;

public interface SctuSpider {
    //下载html文件
    String downloadHtml(String ur1);     //ur：表示网站地址

    //提取需要的信息
    List<Article> parseHtml1(String html1);

    //提取的信息保存到xt文件
    void saveToTxtfile(List<Article> articleList,String filePath);  //filePath：保存文件的路径

    //提供一个面向用户友好的方法
    void collectArticles(String ur1, String filePath);
}
