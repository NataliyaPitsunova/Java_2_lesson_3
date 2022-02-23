import Phone.Phone;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        System.out.println("1 задание  - Словарь");
        System.out.println();
        ArrayList<String> fruits = new ArrayList<>();
        fruits.addAll(List.of("Арбуз", "Банан", "Апельсин", "Лимон", "Гуава", "Апельсин", "Ананас", "Банан", "Кокос", "Крыжовник", "Дыня", "Яблоко"));
        LinkedHashSet<String> lhs = new LinkedHashSet<>(fruits);
        for (String value : lhs
        ) {
            int count = Collections.frequency(fruits, value);
            System.out.println(value + " " + count);
        }
        System.out.println();
        System.out.println("2 задание - Телефонный справочник");
        System.out.println();

        Phone phoneBook = new Phone();
        phoneBook.add("Иванов", "1234548791");
        phoneBook.add("Иванов", "1236548782");
        phoneBook.add("Сидоров", "1237548793");
        phoneBook.add("Абрамов", "4568711985");
        phoneBook.add("Иванов", "9876548798");
        phoneBook.add("Ковалев", "6857548773");

        phoneBook.get("Иванов");
        phoneBook.get("Ковалев");
    }
}

