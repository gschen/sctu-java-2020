package dately.work.scool.experiment3;

import java.io.*;
import java.util.*;

public class T6 {
    public static void main(String[] args) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("D://test06.txt","rw");
            int b = randomAccessFile.read();
            //读操作,必须把指针移到头部
            randomAccessFile.seek(0);
            //一次性读取
            byte[] buf=new byte[(int)randomAccessFile.length()];
            randomAccessFile.read(buf);
            //System.out.println(Arrays.toString(buf));//打印出字节数组
            //将字节数组转为字符串
            //1.
            System.out.println("第一题:");
            String mylist=new String(buf,"utf-8");
            int n = mylist.length();
            System.out.println("一共出现了"+n+"个单词");

            //2.
            System.out.println("第二题：");
            String[] ss = mylist.split(" ");
            Set<String> set = new HashSet<>(Arrays.asList(ss));
            int m = set.size();
            System.out.println("有"+m+"个互不相同的单词");

            //3.
            System.out.println("第三题：");
            BufferedReader br = new BufferedReader(new FileReader("D://test06.txt"));
            StringBuffer sb = new StringBuffer();
            String text =null;
            while ((text=br.readLine())!= null){
                sb.append(text);// 将读取出的字符追加到stringbuffer中
            }
            br.close();  // 关闭读入流

            String str = sb.toString().toLowerCase(); // 将stringBuffer转为字符并转换为小写
            String[] words = str.split("[^(a-zA-Z)]+");  // 非单词的字符来分割，得到所有单词
            Map<String ,Integer> map = new HashMap<String, Integer>() ;

            for(String word :words){
                if(map.get(word)==null){  // 若不存在说明是第一次，则加入到map,出现次数为1
                    map.put(word,1);
                }else{
                    map.put(word,map.get(word)+1);  // 若存在，次数累加1
                }
            }

            // 排序
            List<Map.Entry<String ,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());

            Comparator<Map.Entry<String,Integer>> comparator = new Comparator<Map.Entry<String, Integer>>() {
                public int compare(Map.Entry<String, Integer> left, Map.Entry<String, Integer> right) {
                    return (left.getValue().compareTo(right.getValue()));
                }
            };
            // 集合默认升序升序
            Collections.sort(list,comparator);

            for(int i=0;i<list.size();i++){// 由高到低输出
                System.out.print(list.get(list.size()-i-1).getKey() +":"+list.get(list.size()-i-1).getValue()+",");
            }




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

