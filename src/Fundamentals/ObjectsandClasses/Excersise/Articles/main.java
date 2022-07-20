package Fundamentals.ObjectsandClasses.Excersise.Articles;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String articleData = scanner.nextLine();
        String title = articleData.split(", ")[0];
        String content = articleData.split(", ")[1];
        String author = articleData.split(", ")[2];

        Articles articles = new Articles(title,content,author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String command = input.split(": ")[0];
            String newValue = input.split(": ")[1];

            switch (command){
                case "Edit":
                    articles.edit(newValue);
                    break;
                case "ChangeAuthor":
                    articles.changeAuthor(newValue);
                    break;
                case "Rename":
                    articles.rename(newValue);
                    break;
            }
        }

        System.out.println(articles.toString());
    }
}
