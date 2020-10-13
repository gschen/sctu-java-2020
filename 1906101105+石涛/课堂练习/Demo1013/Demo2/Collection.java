package Demo1013.Demo2;

import java.util.List;

public interface Collection {
    // 方法
    // 下载网页，保存在设置的位置
    String downloadHtml(String url);

    // 打开下好的网页进行查找数据
    List<Article> parseHtml();

    // 将数据进行保存在设置好的文件内
    void saveToTxtFile();
}
