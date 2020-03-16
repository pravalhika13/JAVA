package com.company;

public class UIControl {
    private boolean isEnabled;
    public void enable(){
        isEnabled=true;
    }

    public void disable(){
        isEnabled=false;
    }
    //to read values

    public boolean isEnabled() {
        return isEnabled;
    }
}
