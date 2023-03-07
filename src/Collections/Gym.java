package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Спортзал. Реализовать логику определения занят тренажер/железо или свободно
 * Завести 20 тренажеров/железок
 * Использовать мапу
 * метод1 - занятие тренажера
 * метод2 - поиск и вывод всех занятых тренажеров/железок
 * метод3 - получить булево значение, свободен тренажер/железо или нет
 */


public class Gym {
    public static void main(String[] args) {

        Map<String, Boolean> equip = new HashMap<>();
        // Завести 20 тренажеров/железок
        equip.put("Штанга", TRUE);
        equip.put("Гантели", FALSE);
        equip.put("Скамья", FALSE);
        equip.put("Канаты", TRUE);
        equip.put("Дорожка", FALSE);
        equip.put("Велосипед", TRUE);
        equip.put("Перекладина", FALSE);
        equip.put("Шар", FALSE);
        equip.put("Гиря", FALSE);
        equip.put("Скакалка", TRUE);
        equip.put("Ринг", FALSE);
        equip.put("Груша", TRUE);
        equip.put("Перчатки", FALSE);
        equip.put("Блин 2.5", FALSE);
        equip.put("Блин 5", FALSE);
        equip.put("Блин 10", TRUE);
        equip.put("Блин 15", TRUE);
        equip.put("Блин 20", TRUE);
        equip.put("Блин 25", TRUE);
        equip.put("Пояс", TRUE);
        equip.put("Утяжелители", TRUE);

       // System.out.println(getTakingStatus(equip, FALSE));
        //Получить булево значение, свободен тренажер/железо или нет*/
        equip.forEach((k,v) -> {
            System.out.println(k +" "+ v);});
        }


    // Занятие тренажера
    private static void takeEquip(Map<String, Boolean> equip, String takingEquip) {
        if (equip.containsValue(TRUE)) {
            equip.replace(takingEquip, Boolean.FALSE);
            System.out.println(equip.get(takingEquip + "Занят вами"));
        }
        {
            System.out.println("Тренажер Занят");
        }
    }
    //Поиск и вывод всех занятых тренажеров/железок
    private static <K, V> Set<K> getTakingStatus(Map<K, V> map, V value) {
        Set<K> status = new HashSet<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                status.add(entry.getKey());
            }
        }
        return status;
    }}
    //Получить булево значение, свободен тренажер/железо или нет*/


