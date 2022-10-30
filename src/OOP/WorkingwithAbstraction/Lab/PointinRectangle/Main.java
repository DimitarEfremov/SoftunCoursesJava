package OOP.WorkingwithAbstraction.Lab.PointinRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottomLeftX = scanner.nextInt();
        int bottomLeftY = scanner.nextInt();
        int topRightX = scanner.nextInt();
        int topRightY = scanner.nextInt();
        scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        Point bottomLeft = new Point(bottomLeftX,bottomLeftY);
        Point topRight = new Point(topRightX,topRightY);

        Rectangle rectangle = new Rectangle(bottomLeft,topRight);

        for (int i = 0; i <n ; i++) {

                int[] pointsArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                Point pointToCheck = new Point(pointsArray[0], pointsArray[1] );

                System.out.println(rectangle.contains(pointToCheck));

        }

    }

}
