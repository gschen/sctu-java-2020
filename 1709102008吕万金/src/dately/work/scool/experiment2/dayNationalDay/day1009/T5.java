package dately.work.scool.experiment2.dayNationalDay.day1009;

public class T5 {
    int length;
    int width;
    int height;

    T5(int length,int width,int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    int getLength(){
        return length;
    }
    void setLength(int length){
        this.length=length;
    }
    int getWidth(){
        return width;
    }
    void setWidth(int width){
        this.width=width;
    }
    int getHeight(){
        return height;
    }
    void setHeight(int height){
        this.height=height;
    }
    int volume(){
        return length*width*height;
    }
    void print(){
        System.out.println("总体积为:"+this.volume());
    }

    public static void main(String[] args) {
        T5 test3=new T5(3,4,5);
        test3.print();
    }
}
