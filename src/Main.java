import java.text.NumberFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        System.out.println("задание 1 ");
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for (int i = 0; i <= arr1.length - 1; i++) {
            System.out.print(arr1[i] + ",");
        }

        System.out.println();
        double[] arr2 = new double[3];
        arr2[0] = 1.57;
        arr2[1] = 7.654;
        arr2[2] = 9.986;
        System.out.println(arr2[0] + "," + arr2[1] + ',' + arr2[2]);

        int[] arr3 = new int[4];
        arr3[0] = 1;
        arr3[1] = 3;
        arr3[2] = 5;
        arr3[3] = 7;
        for (int i = 0; i <= arr3.length - 1; i++) {
            System.out.print(arr3[i] + ",");
        }

        System.out.println();
        System.out.println("задание 2");

        int[] arr11 = new int[3];
        arr11[0] = 1;
        arr11[1] = 2;
        arr11[2] = 3;
        for (int i = 0; i < arr11.length; i++) {
            System.out.print(arr11[i]);
            if (i != arr11.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        double[] arr22 = new double[3];
        arr22[0] = 1.57;
        arr22[1] = 7.654;
        arr22[2] = 9.986;
        for (int d = 0; d < arr22.length; d++) {
            System.out.print(arr22[d]);
            if (d != arr22.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        int [] arr33=new int [4];
        arr33[0]=1;
        arr33[1]=3;
        arr33[2]=5;
        arr33[3]=7;
        for(int i=0;i< arr33.length;i++){
            System.out.print(arr33[i]);
            if(i!= arr33.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println("задание 3");
        int []arr111= new int[3];
        arr111[0]=1;
        arr111[1]=2;
        arr111[2]=3;
        for(int i= arr111.length-1;i>=0;i--){
            System.out.print(arr111[i]);
            if(i!=0){
                System.out.print(",");
            }
        }
        System.out.println();
        double[] arr222= new double[3];
        arr222[0]=1.57;
        arr222[1]=7.654;
        arr222[2]=9.986;
        for(int i= arr222.length-1;i>=0;i--){
            System.out.print(arr222[i]);
            if(i!=0){
                System.out.print(",");
            }
        }
        System.out.println();
        int[]arr333=new int[4];
        arr333[0]=1;
        arr333[1]=3;
        arr333[2]=5;
        arr333[3]=7;
        for(int i= arr333.length-1;i>=0;i--){
            System.out.print(arr333[i]);
            if(i!=0){
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println(" задание 4");
        int[]arr = {1,2,3};
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]++;
            }
            System.out.print(arr[i]+",");
        }



    }

}



