package com.superfamicomcoder.codefellowship;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {
/****************
 * Instance Variables
 * */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;




/****************
 * Constructors
 * */



/****************
 * Getters / Setters
 * */
    public long getId() {
        return id;
    }



/****************
 * Interface Methods
 * */
}
