import java.text.DecimalFormat;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework_9.Arrays.Part_2");
        int[] array = arrayRandom(30);
        DecimalFormat bigNumberSeparator = new DecimalFormat("###,###,###.##");
        System.out.println("Task 1");// Найдем сумму расходов за 30 дней
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        System.out.println("Сумма трат за месяц составила " + bigNumberSeparator.format(sum) + " рублей.");
        System.out.println(" ");

        System.out.println("Task 2");//Найдем минимальную и максимальную сумму трат за день
        int minMeaning = array[0];
        int maxMeaning = array[0];
        for (final int current : array) {
            if (current < minMeaning) {
                minMeaning = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + bigNumberSeparator.format(minMeaning) + " рублей.");
        for (final int current : array) {
            if (current > maxMeaning) {
                maxMeaning = current;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + bigNumberSeparator.format(maxMeaning) + " рублей.");
        System.out.println(" ");

        System.out.println("Task 3");// Найдем среднюю сумму затрат за 30 дней, прим.: подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).
        System.out.println("Средняя сумма трат за месяц составила " + bigNumberSeparator.format((double)sum/array.length)+ " рублей.");
        System.out.println(" ");

        System.out.println("Task 4");//Напишем код, который в случае бага будет выводить Ф. И. О. сотрудников в корректном виде.
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
    public static int[] arrayRandom(int length) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100_000) + 100_000;
        }
        return array;
    }

}