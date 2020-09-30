package edu.sctu.java.day0929;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args){
//        Doctor[] doctors = new Doctor[2];
//        for (int i = 0; i < doctors.length; i++) {
//            doctors[i]=new Doctor();
//        }
//        doctors[0].age = 18;
//        doctors[1].age = 12;
//        System.out.println(doctors[1].age);


        List<Doctor> DoctorList = new ArrayList<Doctor>();
        Doctor zhou = new Doctor();
        zhou.age=17;

        //向集合添加元素
        DoctorList.add(zhou);//ctrl+d 克隆
        DoctorList.add(zhou);
        DoctorList.add(zhou);
        DoctorList.add(zhou);

        //删除集合的元素
//        DoctorList.remove(zhou);

        //打印集合所有元素
        for (Doctor d: DoctorList){
            System.out.println(d.age);
        }
    }
}
