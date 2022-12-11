public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        testSum(5, 10);
        positiveAndNegativeNumbers(-9);
        positiveAndNegativeNumbers1(9);
        printString("- Java pro is super courses-\n ", 3);
        leapYear(1996);
    }

    private static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    private static void checkSumSign() {
        int a = 5;
        int b = -10;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Sum is positive");
        } else {
            System.out.println("Sum is negative");
        }
    }

    private static void printColor() {
        int value = 40;
        if (value <= 0) {
            System.out.println("red");
        } else if (value > 0 && value <= 100) {
            System.out.println("yellow");
        } else if (value > 100) {
            System.out.println("green");
        }
    }

    private static void compareNumbers() {
        int a = 5;
        int b = 9;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    private static void testSum(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    private static void positiveAndNegativeNumbers(int a) {
        if (a >= 0) {
            System.out.println("this number positive");
        } else {
            System.out.println("this number negative");
        }
    }

    private static void positiveAndNegativeNumbers1(int a) {
        if (a > 0) {
            System.out.println(false);
        } else if (a < 0) {
            System.out.println(true);
        } else {
            System.out.println("this number 0");
        }
    }

    private static void printString(String str, int n) {
        System.out.println(str.repeat(n));
    }

    private static void leapYear(int y) {
        if ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}



