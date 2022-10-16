package Advanced.Generics.Excersise.CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        CustomList<String> customList = new CustomList<>();


        while (!input.equals("END")){
            String[] parts = input.split("\\s+");
            String command = parts[0];

            switch (command){

                case "Add":
                    customList.add(parts[1]);
                    break;
                case "Remove":
                    int indextToRemove = Integer.parseInt(parts[1]);
                    customList.remove(indextToRemove);
                    break;
                case "Contains":
                    System.out.println(customList.contains(parts[1]));
                    break;
                case "Swap":
                    int index1 = Integer.parseInt(parts[1]);
                    int index2 = Integer.parseInt(parts[2]);
                    customList.swap(index1,index2);
                    break;
                case "Greater":
                    System.out.println(customList.elementsBiggerThan(parts[1]));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    System.out.println(customList);
                    break;
                case "Sort":
                    SorterCL.sort(customList);
                    break;

            }





            input = scanner.nextLine();
        }
    }
}
