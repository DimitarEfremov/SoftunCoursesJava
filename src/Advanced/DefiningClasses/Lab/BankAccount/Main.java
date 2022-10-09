package Advanced.DefiningClasses.Lab.BankAccount;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> bankAccountMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[] splitInput = input.split("\\s+");

            String command = splitInput[0];

            switch (command){

                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    bankAccountMap.put(bankAccount.getId(), bankAccount);
                    System.out.printf("Account ID%d created%n",bankAccount.getId());
                    break;

                case "Deposit":
                    int bankAccountID = Integer.parseInt(splitInput[1]);
                    if (!bankAccountMap.containsKey(bankAccountID)){
                        System.out.println("Account does not exist");
                        break;
                    }
                    double amountToAdd = Double.parseDouble(splitInput[2]);
                    bankAccountMap.get(bankAccountID).deposit(amountToAdd);
                    System.out.printf("Deposited %.0f to ID%d%n",amountToAdd,bankAccountID);
                    break;

                case "SetInterest":
                    BankAccount.setInterestRate(Double.parseDouble(splitInput[1]));
                    break;

                case "GetInterest":
                    bankAccountID = Integer.parseInt(splitInput[1]);
                    if (!bankAccountMap.containsKey(bankAccountID)){
                        System.out.println("Account does not exist");
                        break;
                    }
                    int years = Integer.parseInt(splitInput[2]);
                    double interestAmount = bankAccountMap.get(bankAccountID).getInterest(years);
                    System.out.printf("%.2f%n", interestAmount);


                    break;



            }




                    input= scanner.nextLine();
        }
    }
}
