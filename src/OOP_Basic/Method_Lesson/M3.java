package OOP_Basic.Method_Lesson;

public class M3 {
    static int sum(){
        int a=11;
        int b=11;
        int c= a+b;
        return c;
    }
    static void sum1(){
        int a=22;
        int b=22;
        int c= a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        System.out.println(sum());
        sum1();
    }
}
//void sum(parameter){}