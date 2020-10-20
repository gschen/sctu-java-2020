package edu.sctu.java.day1013;

import java.util.List;

public interface DataAcquisition {

    //将网站下载到本地
    String download(String url);

    //数据提取封装在一个类里面
    List<Article> acquisition(String data);

    //提取到的信息保存到txt
    void saveToTxtFile(List<Article> articleList,
                       String filePath);

    //提供一个用户友好的方法
    void collectArticles(String url, String filePath);

}
