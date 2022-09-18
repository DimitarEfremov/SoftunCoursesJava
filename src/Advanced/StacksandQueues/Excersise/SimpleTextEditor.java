package Advanced.StacksandQueues.Excersise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int operations = Integer.parseInt(scanner.nextLine());

        StringBuilder text = new StringBuilder("");
        ArrayDeque<String> history = new ArrayDeque<>();


        for (int i = 0; i < operations; i++) {

            String input = scanner.nextLine();
            String command = input.split(" ")[0];

            switch (command) {
                case "1":

                    text.append(input.split(" ")[1]);
                    history.push(String.valueOf(text));

                    break;

                case "2":

                    text.delete((text.length() - Integer.parseInt(input.split(" ")[1])), text.length());
                    history.push(String.valueOf(text));

                    break;

                case "3":

                    System.out.println(text.charAt(Integer.parseInt(input.split(" ")[1]) - 1));

                    break;

                case "4":

                    if (history.size() < 2) {

                        text = new StringBuilder("");
                        history.pop();
                        history.push("");
                    } else {

                        history.pop();
                        text = new StringBuilder(history.peek());

                        break;

                    }

            }

        }
    }

}
