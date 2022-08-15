package Fundamentals.FinalEXAM;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MonthlyReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> distributorsMap = new LinkedHashMap<>();
        Map<String, Double> clientsMap = new LinkedHashMap<>();
        double totalIncome = 0;

        String input = scanner.nextLine();

        while (!input.equals("End")){
            if (input.contains("Deliver")){
                String distributorName = input.split(" ")[1];
                double moneySpend = Double.parseDouble(input.split(" ")[2]);

                if (!distributorsMap.containsKey(distributorName)){
                    distributorsMap.put(distributorName,moneySpend);
                } else {
                    double spendSoFar = distributorsMap.get(distributorName);
                    distributorsMap.put(distributorName,spendSoFar+moneySpend);
                }
            }
            else if (input.contains("Return")){
                String distributorName = input.split(" ")[1];
                double moneyReturned = Double.parseDouble(input.split(" ")[2]);
                if (distributorsMap.containsKey(distributorName)){
                    double difference = distributorsMap.get(distributorName) - moneyReturned;
                    if (difference == 0){
                        distributorsMap.remove(distributorName);
                    } else if (difference > 0){
                        distributorsMap.put(distributorName,difference);
                    }
                }
            }
            else if (input.contains("Sell")){
                String clientName = input.split(" ")[1];
                double moneyEarned = Double.parseDouble(input.split(" ")[2]);
                totalIncome += moneyEarned;
                if (!clientsMap.containsKey(clientName)){
                    clientsMap.put(clientName,moneyEarned);
                } else {
                    double spendSoFar = clientsMap.get(clientName);
                    clientsMap.put(clientName,spendSoFar+moneyEarned);
                }



            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : clientsMap.entrySet()) {
            System.out.printf("%s: %.2f%n",entry.getKey(),entry.getValue());
        }

        System.out.println("-----------");

        for (Map.Entry<String, Double> entry : distributorsMap.entrySet()) {
            System.out.printf("%s: %.2f%n",entry.getKey(),entry.getValue());
        }

        System.out.println("-----------");

        System.out.printf("Total Income: %.2f%n",totalIncome);
    }
}
