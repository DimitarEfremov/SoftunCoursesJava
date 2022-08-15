package Fundamentals.FinalEXAM;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int registrationsCount = 0;

        String regex = "[U$]{2}(?<un>[A-Z][a-z]{2,})[U$]{2}[P@$]{3}(?<pas>[A-Za-z]{5,}[0-9]+)[P@$]{3}";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i <n ; i++) {
            String input = scanner.nextLine();

            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                registrationsCount++;
                String user = matcher.group("un");
                String pass = matcher.group("pas");
                System.out.println("Registration was successful");
                System.out.printf("Username: %s, Password: %s%n",user,pass);

            }else {
                System.out.println("Invalid username or password");
            }


        }

        System.out.printf("Successful registrations: %d",registrationsCount);
    }
}
