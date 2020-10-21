package edu.sctu.java.day1013;

import java.util.List;

public interface SctuSpider {



//    下载html文件
    String downloadHtml(String url);


//    提取需要信息
    List<Article> parseHtml(String html);


//    提取信息保存到text文件
    void saveToTextFile(List<Article> articleList,String filepath);

//    提供用户友好方法
    void collectArticles(String url, String filePath);





    void requests(String url);
//    获得页面信息
    void getinformation();
//    提取需要信息，并处理
    void writetext();
//    写入文件并保存
}
