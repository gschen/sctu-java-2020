package 课堂练习05.java;

import java.util.List;

public class SpiderImpl {
    SctuSpider sctuSpider = new SctuSpider() {
        @Override
        public String downloadHtml(String url) {
            return null;
        }

        @Override
        public List<Article> parseHtml(String html) {
            return null;
        }

        @Override
        public void saveToTxtFile(List<Article> articleList, String filepath) {

        }

        @Override
        public void collectArticle(String url, String filePath) {

        }
    };
}


