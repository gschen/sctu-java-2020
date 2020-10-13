package edu.sctu.java.Day1013;

public class SpiderClient {
    public static void main(String[] args) {
        SctuSpider sctuSpider = new SctuSpiderImpl();
        sctuSpider.collectArticles("http://www.sctu.edu.cn/index.htm","test.txt");
    }
}
