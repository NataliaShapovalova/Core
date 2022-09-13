package natasha.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 2, 7};
        ArrayList<Integer> listNumbers = new ArrayList<>();
        for (int number : numbers) {
            listNumbers.add(number);
        }

        for (int i = 0; i < listNumbers.size(); i++) {
            Integer firstElement = listNumbers.get(i);
            ArrayList<Integer> list = new ArrayList<>(listNumbers);
            list.remove(i);
            for (Integer secondElement : list) {
                if (firstElement + secondElement == 10) {
                    ArrayList<Integer> result = new ArrayList<>();
                    result.add(firstElement);
                    result.add(secondElement);
                    System.out.println(result);
                    return;
                }
            }
        }
        System.out.println("Не найдено");
    }
}
