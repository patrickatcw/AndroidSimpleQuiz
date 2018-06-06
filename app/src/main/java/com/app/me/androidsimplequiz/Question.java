package com.app.me.androidsimplequiz;


public class Question {

    //variables
    private int mTextResID;
    private Boolean mAnswer;

    //constructor
    public Question(int mTextResID, Boolean mAnswer) {
        this.mTextResID = mTextResID;
        this.mAnswer = mAnswer;
    }

    //getters and setters
    public int getmTextResID() {
        return mTextResID;
    }

    public void setmTextResID(int mTextResID) {
        this.mTextResID = mTextResID;
    }

    public Boolean getmAnswer() {
        return mAnswer;
    }

    public void setmAnswer(Boolean mAnswer) {
        this.mAnswer = mAnswer;
    }


}
