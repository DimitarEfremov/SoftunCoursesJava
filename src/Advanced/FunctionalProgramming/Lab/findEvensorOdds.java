package Advanced.StreamsFilesandDirectories.Excersise;

import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class findEvensorOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startRange = scanner.nextInt();
        int endRange = scanner.nextInt();
        scanner.nextLine();

        String condition = scanner.nextLine();

        IntPredicate predicate = n -> condition.equals("odd") == (n % 2 != 0);

        String output = IntStream.rangeClosed(startRange, endRange)
                .filter(predicate)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(output);


    }

}

