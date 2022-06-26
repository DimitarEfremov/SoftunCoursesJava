package Fundamentals.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean noMagic = true;

        for (int i = 0; i <= nums.length-1 ; i++) {


            int left = 0;
            int right = 0;
            for (int j = 0; j < i; j++) {
                left += nums[j];
            }
            for (int j = i+1; j <nums.length ; j++) {
                right+= nums[j];
            }
            if (left == right){
                System.out.print(i + " ");
                noMagic = false;
            }

        }
        if (noMagic){
            System.out.println("no");
        }

    }
}
