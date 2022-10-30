package OOP.WorkingwithAbstraction.Excersise.Lights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lights = scanner.nextLine().split("\\s+");
        int iterations = scanner.nextInt();

        List<TrafficLight> trafficLights = new ArrayList<>();

        for (String light : lights) {
            Color color = Color.valueOf(light);
            TrafficLight trafficLight = new TrafficLight(color);
            trafficLights.add(trafficLight);
        }

        for (int i = 0; i <iterations ; i++) {
            for (TrafficLight trafficLight : trafficLights) {
                trafficLight.changeColor();
            }
            trafficLights.forEach(trafficLight -> System.out.print(trafficLight.getColour() + " "));
            System.out.println();
        }


    }
}
