package OOP_Basic.Method_Lesson;

class CustomClass{

}
public class M2 {

    static String  name(){
        System.out.println("This is my name");
        return "Forestro ";
    }
static CustomClass returnObj(){
        return new CustomClass();
}
    public static void main(String[] args) {
    name();
        System.out.println(name()+"is my name");
        System.out.println(returnObj());
    }
}
