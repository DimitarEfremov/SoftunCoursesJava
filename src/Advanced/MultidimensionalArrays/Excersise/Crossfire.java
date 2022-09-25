package Advanced.MultidimensionalArrays.Excersise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int matrixRows = dimensions[0];
        int matrixColumns = dimensions[1];

       // ArrayList<Integer>[] matrix = new ArrayList<>[matrixRows];
        List<List<Integer>> matrix = new ArrayList<>();

        int n = 1;

        for (int r = 0; r <matrixRows ; r++) {
            matrix.add(new ArrayList<>());
            for (int i = 0; i < matrixColumns; i++) {
                matrix.get(r).add(n++);
            }
        }





        String input = scanner.nextLine();

        while (!input.equals("Nuke it from orbit")){
            int row = Integer.parseInt(input.split(" ")[0]);
            int col = Integer.parseInt(input.split(" ")[1]);
            int radius = Integer.parseInt(input.split(" ")[2]);


            for (int r = row - radius; r <= row + radius ; r++) {
                if (isInBounds(matrix,r,col) && r != row){
                    matrix.get(r).remove(col);
                }
            }


            for (int c = col + radius; c >= col - radius ; c--) {
                    if (isInBounds(matrix,row,c)){
                        matrix.get(row).remove(c);
                    }
            }

            matrix.removeIf(List::isEmpty);



            input = scanner.nextLine();
        }

        print(matrix);


    }

    private static void print(List<List<Integer>> matrix) {
        for (List<Integer> ints : matrix) {
            for (Integer anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }


    private static boolean isInBounds(List<List<Integer>> matrix, int i, int j) {
        return i >= 0 && i < matrix.size() && j >= 0 &&  j < matrix.get(i).size();
    }
}
