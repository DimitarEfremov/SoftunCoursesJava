package Fundamentals.ObjectsandClasses.Excersise.Articles;

import java.security.PublicKey;

public class Articles {

    //harakteristkiki -> poleta
    private String title ;
    private String content;
    private String author;

    // konstruktor -> syzdavame obekiti

    public Articles(String title , String content , String author ) {
        this.title = title;
        this.content = content;
        this.author = author;

    }
    // funkcionalnosti -> metodi

    public void Edit (String newContent){
            this.content = newContent;
    }

    public void ChangeAuthor (String newAuthor){
            this.author = newAuthor;
    }

    public void Rename (String newTitle){
            this.title = newTitle;
    }

}
