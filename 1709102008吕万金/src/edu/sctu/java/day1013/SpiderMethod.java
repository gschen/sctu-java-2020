package edu.sctu.java.day1013;

import java.util.List;
public interface SpiderMethod{
//    void download(String url);//链接网页并下载本地
//
//    String getMessage();//提取数据
//
//    void setMessage(String message);//导入数据保存
//
//    void search(String str);//查询自己需要的信息。
    //下载html
    String downloadHtml(String url);

    //提取信息
    List<Article> parseHtml(String html);

    //提取信息保存到txt文件
    void saveToTextFile(List<Article> articleList,
                        String filePath);//文件里要有提取信息和保存文件路径

    //面向用户（其他类开发者，想要调用你写的接口代码的人群）、用户友好型
    void collectArticles(String url,String filePath);
}
