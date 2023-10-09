package Lesson;

public class Whileloop {
    public static void main(String[] args) {

        int a=7;
        while(a<10){
            System.out.println(a);
            a++;

        }
        do {
            System.out.print(a+"\t");
            a+=2;
        }while(a<20);

        int b =20;
        do {
            System.out.println(b);
            b+=2;
        }
        while (b<=35);
    }
}
