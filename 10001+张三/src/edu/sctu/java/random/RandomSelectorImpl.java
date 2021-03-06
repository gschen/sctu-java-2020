package edu.sctu.java.random;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomSelectorImpl implements RandomSelector {
    @Override
    public String selectStudent(String path) {

        // 获得随机索引
        Random random = new Random();
        int index = random.nextInt(38);

        // 加载文件生成nameList
        List<String> nameList = new ArrayList<String>();

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(path)
            );

            String line;

            while ((line = reader.readLine()) != null) {
                nameList.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 返回随机选择的人员
        String selectedName = nameList.get(index);
        return selectedName;
    }
}
