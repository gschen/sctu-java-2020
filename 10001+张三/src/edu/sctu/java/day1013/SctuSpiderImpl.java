package edu.sctu.java.day1013;

import java.util.List;

// Implementation
public class SctuSpiderImpl implements SctuSpider {
    @Override
    public String downloadHtml(String url) {
        return null;
    }

    @Override
    public List<Article> parseHtml(String html) {
        return null;
    }

    // 重点关注
    @Override
    public void saveToTxtFile(List<Article> articleList,
                              String filePath) {
        // 1. 字节流


        // 2. 字符流


    }

    @Override
    public void collectArticles(String url, String filePath) {

    }
}
