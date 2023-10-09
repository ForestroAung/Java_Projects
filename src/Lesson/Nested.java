package Lesson;

public class Nested {
    public static void main(String[] args) {
        int a = 45;

        if (a<40) {
            int b = 10;
            if (b == 1) {
                System.out.println("b is equal to 1");
            } else if (b == 2) {
                System.out.println("b is equal 2");
            } else {
                System.out.println("not equal to 1 and 2");
            }
        } else {
                System.out.println("a is less than 45");
            }
        }
    }

