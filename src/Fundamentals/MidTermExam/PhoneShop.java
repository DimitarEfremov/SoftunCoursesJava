package Fundamentals.MidTermExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PhoneShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phoneList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("End")){
            String[] command = input.split(" - ");

            switch (command[0]){
                case "Add":
                    if (!phoneList.contains(command[1])){
                        phoneList.add(command[1]);
                    }
                    break;
                case "Remove":
                    phoneList.remove(command[1]);
                    break;
                case "Bonus phone":
                    String[] bonusPhone = command[1].split(":");
                    if (phoneList.contains(bonusPhone[0])){
                        for (int i = 0; i < phoneList.size(); i++) {
                            if (phoneList.get(i).equals(bonusPhone[0])){
                                phoneList.add(i +1,bonusPhone[1]);
                                break;
                            }
                        }
                    }
                    break;
                case "Last":
                    if (phoneList.contains(command[1])){

                        for (int i = 0; i < phoneList.size(); i++) {
                            if (phoneList.get(i).equals(command[1])){
                                String currentPhone = phoneList.get(i);
                                phoneList.remove(i);
                                phoneList.add(currentPhone);
                            }
                        }
                    }
                    break;
            }


            input = scanner.nextLine();
        }


        System.out.println(String.join(", ", phoneList));
    }
}
