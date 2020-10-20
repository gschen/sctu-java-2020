package edu.sctu.java.day1013;

import java.util.List;

public class SctuSpiderImpl implements DataCollect{
    @Override
    public String DownloadHtml(String url) {
        return null;
    }

    @Override
    public List<Article> GetInfoNeed(String html) {
        return null;
    }
    //重点
    @Override
    public void StoreToTxtFile(List<Article> articleList, String filePath) {

    }

    @Override
    public void collectArticles(String url, String filePath) {

    }
}
