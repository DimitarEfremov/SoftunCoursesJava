package Advanced.StacksandQueues.StacksandQueues.Excersise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class InfixtoPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<String> queue = new ArrayDeque<>();

        for (String s : input) {
            queue.offer(s);
        }

        ArrayDeque<String> output  = new ArrayDeque<>();
        ArrayDeque<String> operator  = new ArrayDeque<>();

        ArrayDeque<String> bracketsOutput  = new ArrayDeque<>();
        ArrayDeque<String> bracketsOperator  = new ArrayDeque<>();

        int counter = 0;

        while (!queue.isEmpty()){
            String toWorkWith = queue.poll();

            if (!isSign(toWorkWith) && !toWorkWith.equals("(") && !toWorkWith.equals(")")){
                output.offer(toWorkWith);
                counter++;
            }
            else if (isSign(toWorkWith)){
                operator.push(toWorkWith);
                if (counter%2 == 0){
                    output.offer(operator.pop());
                }
            }
            else if (toWorkWith.equals("(")){

                String commaExpression =queue.poll();

                while (!commaExpression.equals(")")){

                    if (!isSign(commaExpression)){
                        bracketsOutput.offer(commaExpression);
                    } else {
                        bracketsOperator.push(commaExpression);
                    }

                    commaExpression = queue.poll();

                }
                    while (!bracketsOutput.isEmpty()){
                        output.offer(bracketsOutput.poll());
                }
                    while (!bracketsOperator.isEmpty()){
                        output.offer(bracketsOperator.poll());
                }
                counter++;
            }


        }

        StringBuilder result = new StringBuilder();

        for (String s : output) {
            result.append(output.poll());
            result.append(" ");
        }

        for (String s : operator) {
            result.append(operator.pop());
            result.append(" ");
        }

        System.out.println(result);

    }


    public static boolean isSign (String str){
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");

    }

}
