package com.company;

public class UIControl {
private boolean isEnabled;
//since this is not the default contructor and it is one manually created we need to call this using super keyword.
    //ths is not our interest in thus module so juts comment and leave this not effecting Main.java class
    //public UIControl(boolean isEnabled) {
        //System.out.println("UI control");
        //this.isEnabled = isEnabled;
    //}

    public void enable(){

        isEnabled=true;
    }

    public void disable(){

        isEnabled=false;
    }
    //to read values

    public boolean isEnabled(){

        return isEnabled;
        }

        public void render(){

        }
}
