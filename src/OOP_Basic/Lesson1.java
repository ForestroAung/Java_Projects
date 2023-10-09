package OOP_Basic;
class Eternal{
    public static void main(String[] args) {
    Lesson1 obj=new Lesson1();
        System.out.println(obj.name);
        System.out.println(Lesson1.name);
    }
}

public class Lesson1 {
    int number=45;//instance variable
    static String name="Htet Myat";

    public static void main(String[] args) {

        int a=12; //local variable
        System.out.println(a);

        System.out.println(name);
        System.out.println(Lesson1.name);


        int num=13;
        String name1="Hla Hla";
        Lesson1 object=new Lesson1();

        Lesson1 oop=new Lesson1();
        System.out.println(oop.number);

    }//main method
}

//syntax for object creation
//className 0r DataType
//object Name or variable
// *new* keyword
//Constructor name or Class name with curly brace


//when variable becomes global variable== field,properties and attributes