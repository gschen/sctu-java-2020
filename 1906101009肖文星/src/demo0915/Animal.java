package demo0915;

public class Animal {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Animal(String name,int id){
        this.name=name;
        this.id=id;
    }

    public void eat(){
        System.out.println(name+"正在吃。");
    }

    public void sleep(){
        System.out.println(name+"正在睡。");

    }

    public void introduction(){
        System.out.println("大家好，我是"+id+"号"+name);
    }
}
