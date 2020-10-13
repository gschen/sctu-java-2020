package edu.sctu.java.Day1013;

import java.util.List;

public interface SctuSpider {
    //将网页下载到本地
    public String downloadHtml(String url);

    //从网页中提取想要的内容(标题)
    public List<String> extractHtml(String html);
    //从网页中提取想要的内容(时间,标题)
    public List<Article> extratHtml1(String html);

    //保存到Txt文件中
    void saveToTxtFile(List<Article> articleList,String filepath);

    //提供一个用户友好的方法
    void collectArticles(String url,String filepath);
}
