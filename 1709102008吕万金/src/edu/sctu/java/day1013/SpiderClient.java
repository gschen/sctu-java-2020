package edu.sctu.java.day1013;

public class SpiderClient {
    public static void main(String[] args) {
            SpiderMethod spiderMethod=new SpiderImpl();
            spiderMethod.collectArticles(
                    "http://www.sctu.edu.cn/xwgl/zhxw1.htm",
                    "output.txt");
    }
}
