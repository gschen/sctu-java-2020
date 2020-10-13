package edu.sctu.java.实验二.Test23;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateCalc extends Date {

    public static void main(String[] args) {

        String birthday = null;

        while(true){
            System.out.println("Please input your birthday in format: (yyyy-MM-dd):");
            try{
                Scanner scanner = new Scanner(System.in);
                birthday = scanner.next("\\d{4}-[01]\\d-[0-3]\\d\\s*");
                break;
            }catch(InputMismatchException mismatchExp){
                System.out.println("Invalid birthday date in format Date should be in format(yyyy-MM-dd')");
            }

        }

        String[] ary = birthday.trim().split("-");

        int year = Integer.parseInt(ary[0]);
        int month = Integer.parseInt(ary[1]);
        int date = Integer.parseInt(ary[2]);

        Calendar calendar = Calendar.getInstance(Locale.US);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.DATE, date);

        String weekDay = new SimpleDateFormat("E").format(calendar.getTime());

        calendar.setTime(new DateCalc());

        long now = calendar.getTimeInMillis();

        if(calendar.get(Calendar.MONTH)+1 > month){
            calendar.add(Calendar.YEAR, 1);
        }

        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.DATE, date);

        long nextBirthMillionSeconds = calendar.getTimeInMillis();

        long julianDay = (nextBirthMillionSeconds - now)/(1000*60*60*24);

        System.out.println(weekDay);

        System.out.println("Only " + julianDay + "d left for your birthday");

    }
}
