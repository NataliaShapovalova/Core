package natasha.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 5, 7};
        int sum = 10;

        Arrays.sort(numbers);
        int first = 0;
        int last = numbers.length - 1;
        while (first < last) {
            int s = numbers[first] + numbers[last];
            if (s == sum) {
                System.out.println(numbers[first] + "+" + numbers[last]);
                return;
            } else {
                if (s < sum) {
                    first++;
                } else {
                    last--;
                }
            }
        }
        System.out.println("Не найдено");
    }
}
