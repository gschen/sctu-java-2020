package edu.sctu.java.Day1013;

import java.util.List;

//Implementation
public class SctuSpiderImpl implements SctuSpider{

    @Override
    public String downloadHtml(String url) {
        return null;
    }

    @Override
    public List<String> extractHtml(String html) {
        return null;
    }

    @Override
    public List<Article> extratHtml1(String html) {
        return null;
    }

    //重点关注
    @Override
    public void saveToTxtFile(List<Article> articleList, String filepath) {
        //1.字节流


        //2.字符流


    }

    @Override
    public void collectArticles(String url, String filepath) {

    }
}
