import java.text.NumberFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }


    public static void task1() {
       String firstName = "Ivan" ;
       String middleName = "Ivanovich";
       String lastName = "Ivanov";
       String fullName = lastName +" " + firstName + " " +middleName;
        System.out.println("Ф.И.О. сотрудника-"+ fullName);
    }
    public static void task2(){
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " +firstName + " " + middleName;
        fullName = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотруднимка для заполнение отчета " + fullName);
    }
    public static void task3(){
        String lastName = "Иванов";
        String firstName = "Семён";
        String middleName = "семёнович";
        String fullName = lastName + " "+ firstName + " " +middleName;
        fullName = fullName.replace( 'ё', 'е');
        System.out.println("Данные Ф.И.О.сотруднимка -" + fullName);
    }

}

