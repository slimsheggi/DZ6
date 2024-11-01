public class Main {
    public static void main(String[] args) {

        // task 1
        System.out.println("task 1");

        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        // task 2
        System.out.println("task 2");

        for (int i = 10; i >= 0; i--){
            System.out.println(i);
        }

        // task 3
        System.out.println("task 3");

        for (int i = 0; i <= 17; i = i + 2){
            System.out.println(i);
        }

        // task 4
        System.out.println("task 4");

        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }

        // task 5
        System.out.println("task 5");

        for (int i = 1904; i <=2096; i = i + 4){
            System.out.println(i + " является высокосным");
        }

        // task 6
        System.out.println("task 6");

        for (int i = 7; i <= 98; i = i + 7){
            System.out.println(i);
        }

        // task 7
        System.out.println("task 7");

        for (int i = 1; i <= 512; i = i * 2){
            System.out.println(i);
        }

        // task 8
        System.out.println("task 8");

        int savings = 29000;
        int totalSavings = 0;
        for (int i = 1; i <= 12; i++){
            totalSavings = totalSavings + savings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalSavings);
        }
        System.out.println("Всего накоплений " + totalSavings);

        // task 9
        System.out.println("task 9");

        savings = 29000;
        totalSavings = 0;
        for (int i = 1; i <= 12; i++){
            totalSavings = totalSavings + totalSavings/100;
            totalSavings = totalSavings + savings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalSavings);
        }
        System.out.println("Всего " + totalSavings + " накоплений.");

        // task 10
        System.out.println("task 10");

        for (int i = 1; i <= 10; i++){
            System.out.println("2 * " + i + " = " + 2*i);
        }
    }
}
