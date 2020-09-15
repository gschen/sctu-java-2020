public class People {
        //基本数据类型：
        int a = 10;
        double b=10.1;//float（4.12f）和double（4.12）区别
        char c='A';//一个字符(单引号，char)
        String d = "hello,world";//多个字符（双引号,String）

        //1.属性：姓名，年龄，性别等。
        String name = "Nancy";
        int age = 27;
        String sex = "women";
        String job = "teacher";


        //2.方法，行为:学习，跑步，看电影等。
        void study(){
            System.out.println(name+"正在学习");
        }

        void run(){
            System.out.println("爱夜跑");
        }

        void movies(){
            System.out.println("爱看电影");
        }

        //Ctrl+N 搜索类

        /*
            多行注释
        */
        //构造函数
        People(){
                System.out.println("这是一个构造函数");
        }
    }


