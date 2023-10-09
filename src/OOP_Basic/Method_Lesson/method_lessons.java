package OOP_Basic.Method_Lesson;

public class method_lessons {

        //instance method
        void show(){
            System.out.println("This is blah");
        }

         int sum(){
           return 0;
        }
        int result(){
            return 123;
        }
    public static void main(String[] args) {
            method_lessons obj=new method_lessons();
            obj.result();
            obj.sum();
            obj.show();
        System.out.println(obj.result());

    }

}


//file concept
//UserDefine method
//Predefine method



//instance method
//static method
