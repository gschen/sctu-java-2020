package 团队Java0923;

public class Test01 {
    public static void main(String[] args) {
        String str="abcd我可以";
        int length=str.length();
        char s=str.charAt(0);
        char t=str.charAt(3);
        System.out.println(s);
        System.out.println(t);
        char charlist[]=new char[60];
        str.getChars(0,6,charlist,0);
        System.out.println(charlist);
        String str1 = "elapant";
        String str2 = "ELEPANT";  //定义两个字符串
        String str3 = "Apple";
        String str4 = "apple";
        /***1、compareTo方法***/
        //不忽略字符串字符大小写
        if(str1.compareTo(str2)>0){
            System.out.println(str1+">"+str2);
            }else if(str1.compareTo(str2) == 0){
            System.out.println(str1+"="+str2);
            }else{
            System.out.println(str1+"="+str2);
            }
        /***2、compareToIgnoreCase()方法***/
        //忽略字符串字符大小写
        if(str1.compareToIgnoreCase(str2)>0){
            System.out.println(str1+">"+str2);
            }else if(str1.compareToIgnoreCase(str2) == 0){
            System.out.println(str1+"="+str2);
            }else{
            System.out.println(str1+"<"+str2);
            }
        /***3、equals()方法***/
        //不忽略字符串字符大小写
        if(str3.equals(str4)){
            System.out.println(str3+"="+str4);
            }else{
            System.out.println(str3+"!="+str4);
            }
        /***4、equalsIgnoreCase()方法***/
        //忽略字符串字符大小写
        if(str3.equalsIgnoreCase(str4)){
            System.out.println(str3+"="+str4);
            }else{
            System.out.println(str3+"!="+str4);
            }
//        /***将字符串类型转换为其他数据类型***/
//        boolean bool = Boolean.getBoolean("false"); //字符串类型转换为布尔类型
//        int integer = Integer.parseInt("20"); //字符串类型转换为整形
//        long LongInt = Long.parseLong("1024"); //字符串类型转换为长整形
//        float f = Float.parseFloat("1.521"); //字符串类型转换为单精度浮点型
//        double d = Double.parseDouble("1.52123");//字符串类型转换为双精度浮点型
//        byte bt = Byte.parseByte("200"); //字符串类型转换为byte型
//        char ch = "棋哥".charAt(0);
//        /***将其他数据类型转换为字符串类型方法1***/
//        String strb1 = String.valueOf(bool); //将布尔类型转换为字符串类型
//        String stri1 = String.valueOf(integer); //将整形转换为字符串类型
//        String strl1 = String.valueOf(LongInt); //将长整型转换为字符串类型
//        String strf1 = String.valueOf(f); //将单精度浮点型转换为字符串类型
//        String strd1 = String.valueOf(d); //将double类型转换为字符串类型
//        String strbt1 = String.valueOf(bt); //将byte转换为字符串类型
//        String strch1 = String.valueOf(ch); //将字符型转换为字符串类型

    }



}
