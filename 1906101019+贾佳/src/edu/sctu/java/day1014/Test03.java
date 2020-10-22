package edu.sctu.java.day1014;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test03 implements SctRandom{
    @Override
    public String selectStudent(String path) {

        List<String> nameList = new ArrayList<String>();
        //加载文件
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine())!=null){
                nameList.add(line);

            }        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 获得随即索引
        Random random = new Random();
        int index = random.nextInt(38);




        String selectedName = nameList.get(index);

        return null;
    }
}
