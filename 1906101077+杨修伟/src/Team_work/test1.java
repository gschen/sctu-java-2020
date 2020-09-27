package Team_work;
//数组

//1,数组必须首先声明变量,double[] arrayRefVar;
// 然后进行创建 arrayRefVar = new dataType[arraySize]

public class test1 {
    public static void main(String[] args) {
        //数组大小
        int size = 5;
        //定义数组
        double[] myList = new double[size];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 34.33;

        /*
        double[] myList = {5.6,4.5,3.3,13.2,34.33}
         */
        //打印所有元素
        for (int i = 0;i<myList.length;i++){
            System.out.println(myList[i]+",");
        }
        //计算所有元素总和
        double total = 0;
        for (int i=0;i<size;i++){
            total +=myList[i];
        }
        System.out.println("总和为"+total);
        //查找最大元素
        double max = myList[0];
        for (int i=0;i<myList.length;i++){
            if (myList[i]>max)
                max = myList[i];
        }
        System.out.println("最大值是"+max);

        //for=Each循环   for (type(字符类型) element:array){
        //                   System.out.println(element)
        //              }

        for (double element:myList){
            System.out.println(element);
        }
    }
}
