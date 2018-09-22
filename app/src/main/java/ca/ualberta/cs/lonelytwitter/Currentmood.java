package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by caboteja on 9/20/18.
 */

public abstract class Currentmood {
    protected String message;
    protected Date date;


    public void setDate(Date date) {
        this.date = date;

    }

    public String getMessage() {
        return this.message;

    }

    public Date getDate() {
        return this.date;
    }

    public abstract Boolean isImportant();


    public void setMessage(String message) {
        this.message = message;
    }
}
