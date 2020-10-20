package edu.sctu.java.day1013;

public class SpiderClient {
    public static void main(String[] args) {
        SctuSpider sctuSpider = new SctuSpiderImpl();
        sctuSpider.collectArticles();
    }
}
