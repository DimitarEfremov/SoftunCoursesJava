package Advanced.SetsandMapsAdvanced.Excersise;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            //   user                   IP     count
        TreeMap< String, LinkedHashMap<String,Integer>> users = new TreeMap<>();

        Pattern patternIP = Pattern.compile("(IP=)(?<furniture>[0-9.a-zA-Z:]+)");

        String input = scanner.nextLine();
        while (!input.equals("end")){

            Matcher matcherForIP = patternIP.matcher(input);

            String ipAddress = matcherForIP.group("furniture");
            System.out.println(ipAddress);



            input = scanner.nextLine();
        }
    }
}
