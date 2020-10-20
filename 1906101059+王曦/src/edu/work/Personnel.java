package edu.work;

public class Personnel {


    String name;
    int id;
    int salary;
    int increasesalary;

    Personnel(String name,int id,int salary,int increasesalary){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.increasesalary = increasesalary;

    }

    void getname(){
        System.out.println(name);
    }


    void getid(){
        System.out.println(id);
    }

    void getsalary(){
        System.out.println(salary);
    }

    void grtincreasesalary(){
        System.out.println(increasesalary);
    }


    void allsalary(){

        System.out.println("allsalary:"+(salary+increasesalary));
    }
}
