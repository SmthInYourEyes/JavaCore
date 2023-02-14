import java.util.*;

public class MapDZ {


    /**
     * LinkedHasMap
     * 1. Наполнить значениями
     * 2. реализовать методы
     * containsValue
     * get
     * clear
     * entrySet
     */

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        Set<Map.Entry> set = new HashSet<>();

        // Заполнение Map V put(K k, V v): помещает в коллекцию новый объект с ключом k и значением v.
        // Если в коллекции уже есть объект с подобным ключом, то он перезаписывается.
        // После добавления возвращает предыдущее значение для ключа k, если он уже был в коллекции. Если же ключа еще не было в коллекции, то возвращается значение null.
        for (int i = 0; i < 5; i++) {
            map.put(i, "Элемент мапы под номером " + i);
        }
        map.put(44, "Element");
        System.out.println(map);

        // containsValue(Object value) - спрашивает есть ли в карте заданное значение.
        System.out.println(map.containsValue("Элемент мапы под номером 1"));

        // get(Object key) - ищем значение по его ключу.
        System.out.println(map.get(2));

        // clear - удаление всех элементов мапы.
        map.clear();
        System.out.println(map);
    }

        //entrySet
        Map.Entry<Integer, String> entry: map.entrySet() {
        System.out.println(entry.getValue());


    }
}

