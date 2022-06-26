package Fundamentals.MidTermExam;

import java.util.Scanner;

public class FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] friendList = scanner.nextLine().split(", ");
        String input = scanner.nextLine();

        int index = 0;
        int blaclistedCount = 0;
        int lostCount = 0;

        while (!input.equals("Report")){
            String[] command = input.split(" ");

            switch (command[0]){
                case "Blacklist" :
                    boolean noSuchname = true;
                    String name = command[1];
                    for (int i = 0; i < friendList.length-1 ; i++) {
                        if (name.equals(friendList[i])){
                            System.out.printf("%s was blacklisted.%n",name);
                            friendList[i] = "Blacklisted";
                            blaclistedCount ++;
                            noSuchname = false;
                        }
                    }
                    if (noSuchname){
                        System.out.printf("%s was not found.%n",name);
                    }
                    break;
                case "Error":
                    index = Integer.parseInt(command[1]);
                    if (index>=0 && index < friendList.length){
                        if (!friendList[index].equals("Blacklisted") && !friendList[index].equals("Lost")){
                            System.out.printf("%s was lost due to an error.%n",friendList[index]);
                            friendList[index] = "Lost";
                            lostCount++;
                        }
                    }
                    break;
                case "Change":
                    index = Integer.parseInt(command[1]);
                    String newName = command[2];
                    if (index>=0 && index < friendList.length){
                        System.out.printf("%s changed his username to %s.%n",friendList[index],newName);
                        friendList[index] = newName;
                    }



                    break;
            }





            input = scanner.nextLine();
        }

        System.out.printf("Blacklisted names: %d%n",blaclistedCount);
        System.out.printf("Lost names: %d%n",lostCount);


        for (String item : friendList) { System.out.print(item + " "); }

    }
}
