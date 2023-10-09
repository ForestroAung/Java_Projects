package Lesson;

public class Copy {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,9};
        System.out.println(num.getClass().getName());
        int others[]=new int[6];
        System.arraycopy(num,3,others,2,4);
        for (int j = 0; j < others.length; j++) {
            System.out.println(others[j]);

        }

    }
}
