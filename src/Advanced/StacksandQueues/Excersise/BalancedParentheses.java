package Advanced.StacksandQueues.Excersise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("");

        ArrayDeque<String> deck = new ArrayDeque<>();

        boolean isBalanced = true;


            for (int i = 0; i <input.length ; i++) {
                if (input[i].equals("(") || input[i].equals("{") || input[i].equals("[") ){
                    deck.push(input[i]);
                }

                else if (input[i].equals("}") && !deck.isEmpty()) {

                    if (deck.peek().equals("{")){
                        deck.pop();
                    }
                    else {
                        isBalanced = false;
                        break;
                    }
                }

                else if (input[i].equals(")") && !deck.isEmpty()) {

                    if (deck.peek().equals("(")){
                        deck.pop();
                    }
                    else {
                        isBalanced = false;
                        break;
                    }
                }

                else if (input[i].equals("]") && !deck.isEmpty()) {

                    if (deck.peek().equals("[")){
                        deck.pop();
                    }
                    else {
                        isBalanced = false;
                        break;
                    }
                }
                else {
                    isBalanced = false;
                }

            }

        if (isBalanced && deck.isEmpty()){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }



    }
}
