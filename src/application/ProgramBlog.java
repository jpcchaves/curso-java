package application;

import entities.Comment;
import entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProgramBlog {
  public static void main(String[] args) {

    DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    LocalDateTime date = LocalDateTime.now();
    String fdate = date.format(pattern);

    Comment c1 = new Comment("Have a nice trip!");
    Comment c2 = new Comment("Wow, that's awesome!");

    Post p1 = new Post(fdate, "Travelling to New Zeland!", "I'm going to visit this " +
            "wonderful country!", 12);


    p1.addComment(c1);
    p1.addComment(c2);

    System.out.println(p1);
  }


}

