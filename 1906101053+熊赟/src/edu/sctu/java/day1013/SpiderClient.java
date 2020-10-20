package edu.sctu.java.day1013;

import java.util.List;

public class SpiderClient {
        SctuSpider sctuSpider = new SctuSpider() {
            @Override
            public String downloadHtml(String ur1) {
                return null;
            }

            @Override
            public List<Article> parseHtml1(String html1) {
                return null;
            }

            @Override
            public void saveToTxtfile(List<Article> articleList, String filePath) {

            }

            @Override
            public void collectArticles(String ur1, String filePath) {

            }
        };



    }


