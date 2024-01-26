public class Main {
    public static void main(String[] args) {
        int yearToCheck = 2024;
        checkLeepYear(yearToCheck);
        int clientDeviceYear =2015;
        int clientIOS = 0;
        task2(clientDeviceYear,clientIOS);
        int deliveryDistance = 95;
        int deliverDays = calculateDeLiveryDays (deliveryDistance);
        printDeliveryDays(deliverDays);

    }
    public static void checkLeepYear(int year){
        if((year % 4==0&& year % 100!=0) ||(year%400==0)) {
            System.out.println(year + "год - високосный год");
        } else {
            System.out.println(year + "год - невисокосный год ");
        }

    }

    public static void task2 (int clientDeviceYear, int clientIOS) {
        clientIOS = 0;
     int clientAndroid = 1;
     if (clientIOS ==0 ){
         if (clientDeviceYear>=2015) {
             System.out.println("скачайте приложение для iOS ");
         } else {
             System.out.println("установите облегченую версию приложения для IOS по ссылке ");
         }
     }else if (clientIOS ==1){
         if (clientDeviceYear>= 2015 ) {
             System.out.println( " установите облегченую версию приложения для Android по сылке ");
         }else {
             System.out.println( "операционная система не поддерживается ");
         }

     }

    }
    public static int calculateDeLiveryDays(int distance) {
        int result = 1;
        if(distance >20){
            result++;
        }
        if(distance>60){
            result++;
        }
        if(distance>100){
            result= -1;
        }
        return result;
    }
    public static void printDeliveryDays(int deliveryDays){
        if(deliveryDays<1){
            System.out.println("доставки");
        }else {
            System.out.println("потребуется дней " + deliveryDays);
        }
    }



}

