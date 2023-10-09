public class Array {
    public static void main(String[] args) {

        String names[]=new String[]{"m","o","n","h","l"};


        for (int i = 2; i < names.length; i++) {
            System.out.print(names[i]+"\t");
        }
        System.out.println();
        for (String name : names) {
            System.out.print(name+"\t");

        }
        System.out.println();
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.print(names[i]+"\t");

        }
    }
}
