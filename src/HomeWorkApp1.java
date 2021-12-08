public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Задание 2");
        printThreeWords();
        System.out.println("Задание 3");
        checkSumSign();
        System.out.println("Задание 4");
        System.out.println(printColor(-1));
        System.out.println(printColor(0));
        System.out.println(printColor(100));
        System.out.println(printColor(101));
        System.out.println("Задание 5");
        System.out.println(compareNumbers(5, 10));
        System.out.println(compareNumbers(10, 10));
        System.out.println(compareNumbers(10, 5));
    }
        public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");}

    public static void checkSumSign() {
        int a = 10;
        int b = -20;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static String printColor(int value) {
        if (value <= 0) {
            return "Красный";
        } else if (value > 0 && value <=100) {
            return "Желтый";
        } else {
            return "Зеленый";
        }
    }

    public static String compareNumbers(int a, int b) {
        if (a >= b) {
            return "a >= b";
        } else {
            return "a < b";
        }
    }

}






