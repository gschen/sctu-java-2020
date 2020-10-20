package edu.sctu.java.day1013;

public class SpiderClient {
    public static void main(String[] args) {
        DataAcquisition sctuSpider = new SctuSpiderImpl();
        sctuSpider.collectArticles("www.","123");
    }
}
