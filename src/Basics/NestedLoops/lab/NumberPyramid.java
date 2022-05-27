package Basics.NestedLoops.lab;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int number = 1;
        boolean flag= false;


        for (int cols = 1; cols <=n; cols++) {
            for (int rows = 1; rows <=cols; rows++) {
                System.out.print(number + " ");
                number++;
                if (number>n){
                    flag=true;
                    break;
                }
            }
            System.out.println();
            if (flag){
                break;
            }

        }


        }
    }

