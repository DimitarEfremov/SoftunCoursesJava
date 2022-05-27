package Basics.WhileLoop.excersises;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lookingFor = scanner.nextLine();

        String checkedBook = scanner.nextLine();
        int books = 0;


        while (!checkedBook.equals("No More Books")){

            if (checkedBook.equals(lookingFor)){
                System.out.printf("You checked %d books and found it.",books);
                break;
            }
            books++;
            checkedBook = scanner.nextLine();
        }
        if (checkedBook.equals("No More Books")) {
            System.out.printf("The book you search is not here!%nYou checked %d books.", books);
        }
    }
}
