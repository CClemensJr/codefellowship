package com.superfamicomcoder.codefellowship;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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




/****************
 * Constructors
 * */
    public Post() {}

    public Post(String body) {
        this.body = body;
        this.timeStamp = LocalDateTime.now().toString();
    }

/****************
 * Getters / Setters
 * */
    public long getId() {
        return this.id;
    }




/****************
 * Interface Methods
 * */
}
