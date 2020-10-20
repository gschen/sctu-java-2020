package edu.sctu.java.day1013;


import java.util.List;

public class SpiderImpl implements SpiderMethod{
    @Override
    public String downloadHtml(String url) {
        return null;
    }
    @Override
    public List<Article> parseHtml(String html) {
        return null;
    }
    @Override
    public void saveToTextFile(List<Article> articleList, String filePath) {
        //字节流

        //字符流
    }
    @Override
    public void collectArticles(String url, String filePath) {

    }
}
