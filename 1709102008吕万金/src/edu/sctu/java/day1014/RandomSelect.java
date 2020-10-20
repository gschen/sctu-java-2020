package edu.sctu.java.day1014;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomSelect implements RandomSelector{

    @Override
    public String selectStudent(String path) {
        //获得随即索引。
        Random random=new Random();
        int index=random.nextInt(38);//最大值

        List<String> nameList=new ArrayList<String>();
//        nameList.add("");
        try {
            BufferedReader reader=new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String selectedName=nameList.get(index);
        //读文件
        return null;
    }
}
