package edu.sctu.java.day1013;

public class SpiderClient {
    public static void main(String[] args) {
        DataCollect dataCollect = new SctuSpiderImpl();
        dataCollect.collectArticles("www.baidu.com","output.txt");
    }
}
