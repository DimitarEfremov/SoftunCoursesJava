package Fundamentals.ArraysMoreExercise;

import java.sql.Array;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Integer[] row = new Integer[] {1};



        for (int i = 1; i <=n ; i++) {

            Integer[] newRaw = new Integer[row.length+1];

            for (int j = 0; j < newRaw.length; j++) {

                int numb1 = 0;
                int numb2 = 0;

               if (newRaw[j-1] <0){
                   numb1 = 0 + newRaw[j];
               }




            }

        }

    }
}
