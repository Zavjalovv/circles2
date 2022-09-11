public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int salary = 15_000;
        int total = 0;
        int b = 0;
        for (; total < 12_000_000; b++) {
            total = total + (total / 100 * 7);
            total = salary + total;
            if (b % 6 == 0) {
                System.out.println(" Месяц  " + b + " Итого " + total);

            }
        }
        int month = 31;
        for (int day = 0; day < 31; day++) {
            day = day + 7;
            System.out.println(" Пятница " + day + " Число ");

        }
        int comet = 0;
        int year = 2022;
        while (comet < 2100) {
            comet = comet + 79;
            if (comet > 1890 && comet < 2100) {
                System.out.println(comet);
            }
            int num1= 1;
            int num2 = 2;
            int num3 = 3;
            int sum = num2 * num1;
            for (num2 = 1; num1 <= 10; num1++) {
                System.out.println("2 *" + num1 + " = " + sum);
                
            }
        }
    }
}
