
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201) - 100;
        }
        System.out.print("Масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        int sumOfNegatives = 0;
        for (int num : array) {
            if (num < 0) {
                sumOfNegatives += num;
            }
        }
        System.out.println("Сума від'ємних чисел: " + sumOfNegatives);
        int countEven = 0;
        int countOdd = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Кількість парних чисел: " + countEven);
        System.out.println("Кількість непарних чисел: " + countOdd);
        int max = array[0];
        int min = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("Найбільший елемент: " + max + ", Індекс: " + maxIndex);
        System.out.println("Найменший елемент: " + min + ", Індекс: " + minIndex);
        double averageAfterFirstNegative = 0;
        boolean foundFirstNegative = false;
        int countAfterFirstNegative = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                foundFirstNegative = true;
                for (int j = i + 1; j < array.length; j++) {
                    averageAfterFirstNegative += array[j];
                    countAfterFirstNegative++;
                }
                break;
            }
        }
        if (foundFirstNegative) {
            averageAfterFirstNegative /= countAfterFirstNegative;
            System.out.println("Середнє арифметичне чисел після першого від'ємного: " + averageAfterFirstNegative);
        } else {
            System.out.println("В масиві немає від'ємних чисел.");
        }
    }
}


