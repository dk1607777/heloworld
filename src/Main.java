import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println( "задача 1");
    int total= 2_459_000;
    int deposit = 15_000;
    double sum =0;
    int month=1;
    double percent = 0.01;
    while ( sum < total ) {
        sum= (1 + percent) *sum;
        sum= sum + deposit;
        System.out.println("Месяц " + month + ", сумма накоплений равна " +sum + " рублнй");
        month++;

        }
        System.out.println("задача 2");
    int number = 0;
    while (number < 10) {
        number++;
        System.out.print(number +" ");
    }
        System.out.println();
    for (; number >= 1; number--) {
        System.out.print(number + " ");
    }
        System.out.println();

        System.out.println("задача 3");
        int population = 12_000_000;
        int fartlityPerThousand = 17;
        int mortalityPerThousand =8;
        int startYear = 2023;
        for (int year = startYear; year < startYear +10; year ++) {
            population = population+fartlityPerThousand * population / 1_000 - mortalityPerThousand * population / 1_000;
            System.out.println(" Год " +  year + ",численость населения составляет " +population);
        }
        System.out.println();

        System.out.println("задача 4 ");

        NumberFormat numberFormat= NumberFormat.getCurrencyInstance();
        total=12_000_000;
        sum = 15_000;
        percent = 0.07;
        month =1;
        while ( sum < total) {
            sum= sum +percent * sum;
            System.out.printf("Месяц %d, сумма накоплений равна %s%n" , month , numberFormat .format(sum));
            month++;

        }
        System.out.println( "задача 5 ");
        sum =15_000;
        month = 1;
        while ( sum <total) {
            sum = sum + percent * sum;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %s%n ", month, numberFormat.format(sum));
            }
            month++;
        }
        System.out.println(" задача 6 ");
        sum = 15_000;
        month = 1;
        int months = 12 * 9;
        while (month <= months) {
            sum = sum+ percent * sum;
            if( month % 6 ==0) {
                System.out.printf("Месяц %d ,сумма накоплений равна %s%n" , month, numberFormat.format(sum));
            }
            month++;
        }
        System.out.println( "задача 7");
        int firstFridayAtTheMonth =3;
        for (int day= firstFridayAtTheMonth;day<=31; day+=7) {
            if (day%7 == firstFridayAtTheMonth) {

            }
            System.out.println(" Сегодня пятница ," + day + "-e число . Необходимо подготовить отчет ");
        }
        System.out.println("задача 8");
        int period = 79;
        int currentYear = 2023;
        int start = currentYear -200;
        int end= currentYear +100;
        for( int year = 0 ;year<=end; year+=period) {
            if(year >=start) {
                System.out.println(year);
            }
        }



    }
}