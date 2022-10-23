import java.util.Scanner;

public class rally2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int size = Integer.parseInt(scanner.nextLine());

        String racingNumber = scanner.nextLine();

        String[][] matrix = new String[size][size];

        for (int i = 0; i <size ; i++) {

            matrix[i] = scanner.nextLine().split(" ");
        }

        matrix[0][0] = "C";

        int carRow = 0;
        int carCol = 0;

        int distance = 0;
        boolean winner = false;


        String command = scanner.nextLine();

        while (!command.equals("End")){
            int newRow = 0;
            int newCol = 0;

            switch (command){


                case"up" :
                    newRow = carRow - 1;
                    newCol = carCol;
                    break;
                case"down" :
                    newRow = carRow + 1;
                    newCol = carCol;
                    break;
                case"left" :
                    newRow = carRow;
                    newCol = carCol - 1;
                    break;
                case"right":
                    newRow = carRow;
                    newCol = carCol + 1;
                    break;
            }

            if (matrix[newRow][newCol].equals(".")){

                matrix[carRow][carCol] = ".";
                matrix[newRow][newCol] = "C";
                carRow = newRow;
                carCol = newCol;
                distance += 10;
            } else if (matrix[newRow][newCol].equals("F")){
                matrix[carRow][carCol] = ".";
                matrix[newRow][newCol] = "C";
                winner = true;
                distance += 10;
            }









            command = scanner.nextLine();
        }
    }
}
