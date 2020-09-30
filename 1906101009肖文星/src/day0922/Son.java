package day0922;

public class Son extends Father {
    //重写 overwrite
    @Override // 注解  annotation
    void sleep(){
        super.sleep();
        System.out.println(name+"正在睡");

    }
}
