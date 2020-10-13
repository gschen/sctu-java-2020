package edu.sctu.java.实验二.Test19;

public class St {
    public static void main(String[] args) {
        String he = "Hello,World";
        char [] arr = he.toCharArray();
        StringBuilder str = new StringBuilder();
        for (int i = arr.length-1; i >= 0; i--) {
            str.append(arr[i]);
        }
        String re = str.toString();
        char [] arr1 = re.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            if(Character.isLowerCase(arr1[i])){
               arr1[i] = Character.toUpperCase(arr1[i]);

            }else {
                arr1[i] = Character.toLowerCase(arr1[i]);

            }

        }
        System.out.println(arr1);
    }
}
