import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        int[] arr1 = generateRandomArray();
        int sum = 0;
        for (int dailyExpenses : arr1) {
            sum += dailyExpenses;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    private static void task2() {
        int[] arr2 = generateRandomArray();
        int maxExpenses = -1;
        int minExpenses = 1_000_000;
        for (int dailyExpenses : arr2) {
            if (dailyExpenses > maxExpenses) {
                maxExpenses = dailyExpenses;
            }
        }
        for (int dailyExpenses : arr2) {
            if (dailyExpenses < minExpenses) {
                minExpenses = dailyExpenses;
            }
        }
        System.out.println("Минимальная сумма трат за составила " + minExpenses + " рублей. Максимальная сумма трат за день составила " + maxExpenses + " рублей.");
    }

    private static void task3() {
        int[] arr3 = generateRandomArray();
        int sum = 0;
        for (int dailyExpenses : arr3) {
            sum += dailyExpenses;
        }
        System.out.println("Средняя сумма трат за месяц составила " + (double) (sum / arr3.length) + " рублей");
    }

    private static void task4() {
        char[] reverseFullName = {'s', 'i', 'n', 'e', 'D', ' ', 'n', 'a', 's', 'o', 'h', 'Z'};
        for (int i = 0; i < reverseFullName.length; i++) {
            char correctNameLetter = reverseFullName[(reverseFullName.length - 1) - i];
            System.out.print(correctNameLetter);
        }
        System.out.println();
    }

    private static void task5() {
        int[][] matrix = new int[3][3];
        int number = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) { //не могу понять, почему условие четности здесь работает наоборот,
                    matrix[i][j] = number;      // т.е. присвоены значения number нечетным ячейкам в нечетных строках
                }
                if (i % 2 != 0 && j % 2 != 0) {
                    matrix[i][j] = number;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void task6() {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    private static void task7() {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            int a = arr[i];
            arr[i] = arr [(arr.length - 1) - i];
            arr [(arr.length - 1) - i] = a;
        }
        System.out.println(Arrays.toString(arr));
    }
}


