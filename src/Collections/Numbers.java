package Collections;

import java.util.ArrayList;

/**
 * метод1 - завести числа от 0 до 3млрд
 * метод2 - добавить в середину (индекс 2500) какое-то число(наиболее быстрый способ)
 * метод3 - найти индекс передаваемого числа
 * метод4 - вывести последние 100 чисел в обратном порядке
 * метод5 - переместить в новый список/множество только четные числа
 * метод6 - выполнить суммирование для каждого из элементов списка/множества с заданным числом
 * + придумать еще 3 метода для работы со списком/множеством, что еще можно с ними сделать.
 */

public class Numbers {
    public static void main(String[] args) {
        //1. Заведение списка
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 30000001; i++) {
            numbers.add(i);
        }
        //System.out.println(numbers);

        //2. Добавить в середину (индекс 2500) какое-то число
        numbers.add(2500, 5553);
        System.out.println(numbers.get(2500));

        //3. Найти индекс передаваемого числа
        System.out.println(numbers.indexOf(4989));

        //4. Вывести последние 100 чисел в обратном порядке
        Integer lastNumber = numbers.get(numbers.size() - 1);
        System.out.println(lastNumber);

        //5. Переместить в новый список/множество только четные числа
        int len = numbers.size();
        ArrayList<Integer> numbers1 = new ArrayList<>();
        for (int a = 0; a < len; a++) {
            if (a % 2 == 0)
                numbers1.add(a);
        }
        //  System.out.println(numbers1);

        //6. Выполнить суммирование для каждого из элементов списка/множества с заданным числом
        for (int b = 0; b < len; b++) {
            numbers1.add(b + 3);
        }

       // System.out.println(numbers1);

    }

}



