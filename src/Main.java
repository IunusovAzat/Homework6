public class Main {
    public static void main(String[] args) {
    // Задание 1
        int[] monthlExpenses = generateRandomArray();
        int sum = 0;
        for (int spendingPerDay = 0; spendingPerDay < monthlExpenses.length; spendingPerDay++) {
            sum +=monthlExpenses[spendingPerDay];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();

        // Задача 2
        int min = monthlExpenses[0];
        int max = monthlExpenses[0];
        for (int i = 1; i < monthlExpenses.length; i++) {
            if (min > monthlExpenses[i]) {
                min = monthlExpenses[i];
            } else if (max < monthlExpenses[i]) {
                max = monthlExpenses[i];
            }
        }
            System.out.println("Минимальная сумма трат за день составила " + min + " рублей. " +
                    "Максимальная сумма трат за день составила " + max + " рублей.");
        System.out.println();

        // Задача 3
        double averageSpending = (double) sum/ monthlExpenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSpending + " рублей" + ".");
        System.out.println();

        // Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);
        }

        }
        public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }
}