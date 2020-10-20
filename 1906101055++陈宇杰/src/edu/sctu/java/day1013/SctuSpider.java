package edu.sctu.java.day1013;

//爬虫示例

import java.util.List;

public interface SctuSpider {

    //下载html文件
    void dowonLoadHtml(String url);

    //提取需要的信息
    List<Article>ParseHtml(String html);


    //保存到txt文件
    void saveToTxtFile(List<Article> articleList,String filepath);

    //面向用户友好的方法
    void collectArticles();
}
