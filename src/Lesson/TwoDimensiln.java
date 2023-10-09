package Lesson;

public class TwoDimensiln {
    public static void main(String[] args) {

        int dNumbers[][]={
                {1,2,3,4,5,6,7,8,9},
                {2,4,6,8,10},
                {1,10,100,1000,10000},
                {3,5,7,8,9},


        };
     //   for (int i = 0; i < dNumbers.length; i++) {
       //     for (int i1 = 0; i1 < dNumbers[i].length; i1++) {
         //       System.out.print(dNumbers[i][i1]+"\t");



            for (int[] dNumber : dNumbers) {
                for (int n:dNumber)
                  System.out.print(n+"\t");
            }
                 System.out.println();

            }

        }

