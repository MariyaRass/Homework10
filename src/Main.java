import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String separator = "";
        String fullName = lastName + separator + firstName + separator + middleName;
        System.out.println("Ф. И. О. сотрудника — "+fullName);

        System.out.println("Задание 2");
        System.out.println("Данные Ф.И.О. сотрудника при заполнении отчета - "+fullName.toUpperCase());

        System.out.println("Задание 3");
        fullName= "Иванов Семён Семёнович".replace(oldChar:'ё', newChar 'e');
        System.out.println("Данные Ф.И.О. сотрудника - "+fullName);


    }
}