package com.example.nazmul.criminalintentpractice;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Ram Rooter on 11/2/2016.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private boolean mSolved;
    private Date mDate;

    public Crime(){
        mDate = new Date();
        mId = UUID.randomUUID();
    }

    public UUID getId(){
        return mId;
    }

    public String getTitle(){
        return mTitle;
    }

    public void setTitle(String title){
        mTitle = title;
    }

    public boolean isSolved(){
        return mSolved;
    }

    public void setSolved(boolean solved){
        mSolved = solved;
    }

    public Date getDate(){
        return mDate;
    }
}
