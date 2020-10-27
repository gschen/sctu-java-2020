package edu.sctu.java.实验三;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test05 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String h = "Hello";
        int j;
         char [] lis=h.toCharArray();
        for (int i = 0; i <lis.length ; i++) {
            j = (int)lis[i]+1;
            stringBuilder.append((char) j);
        }
        try {
            Writer writer = new FileWriter("out.txt");

            writer.write(String.valueOf(stringBuilder));
            writer.close();
            BufferedReader bf = new BufferedReader(new FileReader("out.txt"));
            String line;
            int s;
            stringBuilder.setLength(0);
            List<String> list = new ArrayList<String>();
            while ((line = bf.readLine())!=null){
                list.add(line);
            }
            for (String p:list){

                char [] k = p.toCharArray();
                for (char st:k){

                   s = (int)st-1;
                   stringBuilder.append((char)s);
                }
            }
            System.out.println(stringBuilder);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
