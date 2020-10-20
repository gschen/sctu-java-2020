package dately.work.scool.experiment2.dayNationalDay.day1010;
//        Scanner s = new Scanner(System.in);
//        int[] arr = new int[10];
//        for(int i = 0; i < arr.length; i++) {
//            int n = i+1;
//            System.out.print("请输入第"+ n + "个数:");
//            arr[i] = s.nextInt();
//        }
//
//        for (int value : arr) {
//            System.out.print(value + " ");
//        }
//        System.out.println();


public class T17 {
    public static void main(String[] args) {
        int[] arr={14,75,84,0,-54,-72,55,55,73,90};

        int max = arr[0];//最大值
        int min = arr[0];//最小值
        for (int value : arr) {
            if (max < value) {
                max = value;
            }
            if (min > value) {
                min = value;
            }
        }
        System.out.println("最大值为："+max);
        System.out.println("最小值为："+min);

        int sum = 0;//总和
        float avg = 0;//平均值
        for (int value : arr) {
            sum += value;
        }
        avg = (float)sum / arr.length;

        System.out.println("总和为："+sum);
        System.out.println("平均值为："+avg);

    }

}
