package Fundamentals.MidTermExam;

import java.util.Scanner;

public class TheBiscuitFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int biscuitsPerWorker = Integer.parseInt(scanner.nextLine());
        int countOfWorkers = Integer.parseInt(scanner.nextLine());
        int competitors = Integer.parseInt(scanner.nextLine());

        int producedPerDay = biscuitsPerWorker*countOfWorkers;
        int produceThirdDay = (int) Math.floor(biscuitsPerWorker*countOfWorkers * 0.75);

        int totalProduction = 0;

        totalProduction = producedPerDay * 20;
        totalProduction += produceThirdDay * 10;


        System.out.printf("You have produced %d biscuits for the past month.%n",totalProduction);

        if (totalProduction>competitors){
            double difference = ((totalProduction*1.0-competitors)/competitors)*100;
            System.out.printf("You produce %.2f percent more biscuits.",difference);
        } else {
            double difference = ((competitors*1.0-totalProduction)/competitors)*100;
            System.out.printf("You produce %.2f percent less biscuits.",difference);
        }


    }
}
