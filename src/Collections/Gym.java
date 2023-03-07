package Collections;

import java.util.HashMap;
import java.util.Map;

/** Спортзал. Реализовать логику определения занят тренажер/железо или свободно
 * Завести 20 тренажеров/железок
 * Использовать мапу
 * 	метод1 - занятие тренажера
 * 	метод2 - поиск и вывод всех занятых тренажеров/железок
 * 	метод3 - получить булево значение, свободен тренажер/железо или нет*/


public class Gym {
    public static void main(String[] args) {

        Map<String, String> equip = new HashMap<>();
        // Завести 20 тренажеров/железок
        equip.put("Штанга", "Свободен");
        equip.put("Гантели", "Занят");
        equip.put("Скамья", "Свободен");
        equip.put("Канаты", "Свободен");
        equip.put("Дорожка", "Свободен");
        equip.put("Велосипед", "Занят");
        equip.put("Перекладина", "Свободен");
        equip.put("Шар", "Свободен");
        equip.put("Гиря", "Свободен");
        equip.put("Скакалка", "Занят");
        equip.put("Ринг", "Свободен");
        equip.put("Груша", "Свободен");
        equip.put("Перчатки", "Занят");
        equip.put("Блин 2.5", "Свободен");
        equip.put("Блин 5", "Свободен");
        equip.put("Блин 10", "Занят");
        equip.put("Блин 15", "Свободен");
        equip.put("Блин 20", "Занят");
        equip.put("Блин 25", "Свободен");
        equip.put("Пояс", "Свободен");
        equip.put("Утяжелители", "Занят");

        // Занятие тренажера
        if (equip.containsValue("Свободен")) {
            equip.replace("Гиря","Занят");
        }
        System.out.println(equip.get("Гиря"));

        //Поиск и вывод всех занятых тренажеров/железок

        for (Map.Entry<String, String> entry : equip.entrySet()) {
            System.out.println(entry.getKey());}

        //Получить булево значение, свободен тренажер/железо или нет*/


    }}
