import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set, реализация методов множеств(список)*
 * Прочесть статьи хабр и джавараш
 * Доп.
 * Set, реализации классов LinkedHashSet и TreeSet
 * Рассказать про
 **/
public class SetDZ {
    public static void main(String[] args) {
        // Заполнение Set
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 25; i++) {
            numbers.add(i);
        }
        Set<String> stroka = new TreeSet<>();
        // Заполнение List
        List<Integer> moreNumbers = List.of(200, 201, 202, 203, 204);

        // Добавление значения в Set
        numbers.add(150);

        // Удаление значения из Set
        numbers.remove(33);

        // Размер Set
        System.out.println(numbers.size());

        // Наличие элемента в Set
        System.out.println(numbers.contains(33));

        // Добавление списка в Set
        numbers.addAll(moreNumbers);

        // удаление списка из Set
        numbers.removeAll(moreNumbers);

        // удаление Set из Set
        numbers.retainAll(moreNumbers);

        // Удаление всего Set
        numbers.clear();
        System.out.println(numbers);
    }
}
