package edu.sctu.java.day1014;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomSelectorImpl implements RandomSelector{


    @Override
    public String selectStudent(String path) {

        //获得随机索引
        Random random = new Random();
        int index = random.nextInt(38);


        //加载文件生成nameList
        List<String> namelist = new ArrayList<String>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String selectedName = namelist.get(index);

        return null;
    }
}
