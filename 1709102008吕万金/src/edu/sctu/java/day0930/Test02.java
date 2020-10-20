package edu.sctu.java.day0930;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Test02 {
    void a(){
        try{
            b();
        }catch (Exception e){
            System.out.println("a处理错误！");
        }
    }
    void b(){
        try {
            System.out.println(10/0);
        }catch(Exception e){
//            System.out.println("b处理错误！");
            throw new ArithmeticException();
            //将这个报错的问题往上一级抛
        }
    }
    void aa() throws ArithmeticException{
        bb();
    }
    void bb(){
    }
    public static void main(String[] args) {
        Test02 test02=new Test02();
        test02.a();
    }
}
