package edu.sctu.java.day1013;

import java.util.List;

//Implementation
public class SctuSpiderImpl implements SctuSpider{
    @Override
    public void dowonLoadHtml(String url) {

    }

    @Override
    public List<Article> ParseHtml(String html) {
        return null;
    }

    //重点关注
    @Override
    public void saveToTxtFile(List<Article> articleList, String filepath) {
      //1.字节流处理方式

      //2.字符流处理方式
    }

    @Override
    public void collectArticles() {

    }
}
