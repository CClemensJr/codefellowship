package com.superfamicomcoder.codefellowship;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Post {
/****************
 * Instance Variables
 * */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String body;
    private String timeStamp;

    @ManyToOne
    ApplicationUser author;


/****************
 * Constructors
 * */
    public Post() {}

    public Post(ApplicationUser author, String body) {
        this.body = body;
        this.timeStamp = LocalDateTime.now().toString();

        this.author = author;
    }

/****************
 * Getters / Setters
 * */
    public long getId() {
        return this.id;
    }
    public String getBody() { return this.body; }
    public String getTimeStamp() { return this.timeStamp; }
    public ApplicationUser getAuthor() { return this.author; }

    public void setBody(String body) { this.body = body; }
    public void setTimeStamp() { this.timeStamp = LocalDateTime.now().toString(); }
    public void setAuthor(ApplicationUser author) { this.author = author; }

}
