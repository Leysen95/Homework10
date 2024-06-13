import javax.sound.midi.Soundbank;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
    String firstName = "Ivan";
    String middleName = "Ivanovich";
    String lastName = "Ivanov";
    String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("Ф. И. О. сотрудника — %s", fullName);
        System.out.println();
        System.out.println();

        System.out.println("Task 2");
        System.out.println(fullName.toUpperCase());
        System.out.println();

        System.out.println("Task 3");
fullName = "Иванов Семён Семёнович";
fullName = fullName.replace("ё", "е");
        System.out.printf("Данные Ф. И. О. сотрудника — %s",fullName);
    }
}
