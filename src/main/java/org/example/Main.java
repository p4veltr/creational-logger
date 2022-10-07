package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");

        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка:");
        Scanner sc = new Scanner(System.in);
        int listSize = Integer.parseInt(sc.nextLine());
        System.out.println("Введите верхнюю границу для значений:");
        int maxThreshold = Integer.parseInt(sc.nextLine());
        logger.log("Введены параметры: " + listSize+" (размер списка) "+maxThreshold+" (верхняя граница значений)");

        logger.log("Создаём и наполняем список");
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            list.add(random.nextInt(maxThreshold));
        }
        logger.log("Вот случайный список: "+list);

        System.out.println("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра:");
        int threshold = Integer.parseInt(sc.nextLine());
        logger.log("Введено значение: " + threshold);

        Filter filter = new Filter(threshold);
        filter.filterOut(list);

        logger.log("Завершаем программу");
    }
}