package edu.sctu.java.day1013;

import java.util.List;

public interface DataCollect {
    //下载html文件
    String DownloadHtml(String url);
    //提取需要的信息
    List<Article> GetInfoNeed(String html);
    //提取的信息保存到txt文件
    void StoreToTxtFile(List<Article> articleList,String filePath);

    //提供一个用户友好的方法
    void collectArticles(String url,String filePatj);
}
