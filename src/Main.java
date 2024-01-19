import java.text.NumberFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        System.out.println("задача 1");
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for (int i = 0; i <= arr1.length - 1; i++) {
            System.out.printf(arr1[i] + ",");
        }

        System.out.println();

        double[] arr2 = new double[3];

        arr2[0] = 1.57;
        arr2[1] = 7.654;
        arr2[2] = 9.986;
        System.out.printf(arr2[0] + "," + arr2[1] + "," + arr2[2]);

        System.out.println();

        int[] arr3 = new int[4];
        arr3[0] = 1;
        arr3[1] = 3;
        arr3[2] = 5;
        arr3[3] = 7;
        for (int i = 0; i <= arr3.length - 1; i++) {
            System.out.printf(arr3[i] + ",");
        }
        System.out.println();

        System.out.println("задание 2 ");
        int[] arr7 = new int[3];
        arr7[0] = 1;
        arr7[1] = 2;
        arr7[2] = 3;
        System.out.printf(arr7[0] + "," + arr7[1] + "," + arr7[2]);

        System.out.println();
        int[] arr9 = new int[4];
        arr9[0] = 1;
        arr9[1] = 3;
        arr9[2] = 5;
        arr9[3] = 7;
        System.out.println(arr9[0] + "," + arr9[1] + "," + arr9[2] + "," + arr9[3]);

        double[] arr8 = new double[3];
        arr8[0] = 1.57;
        arr8[1] = 7.654;
        arr8[2] = 9.986;
        System.out.println(arr8[0] + "," + arr8[1] + "," + arr8[2]);


        System.out.println("задача 3");
        int[] arr4 = new int[3];
        arr4[0] = 1;
        arr4[1] = 2;
        arr4[2] = 3;
        System.out.println(arr4[2] + "," + arr4[1] + "," + arr4[0]);
        double[] arr5 = new double[3];
        arr5[0] = 1.57;
        arr5[1] = 7.654;
        arr5[2] = 9.986;
        System.out.println(arr5[2] + "," + arr5[1] + "," + arr5[0]);
        int[] arr6 = new int[4];
        arr6[0] = 1;
        arr6[1] = 3;
        arr6[2] = 5;
        arr6[3] = 7;
        System.out.println(arr6[3] + "," + arr6[2] + "," + arr6[1] + "," + arr6[0]);
        System.out.println("зфдание 4");
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i]++;
            }
                System.out.println(arr[i] +",");




        }

    }


}


