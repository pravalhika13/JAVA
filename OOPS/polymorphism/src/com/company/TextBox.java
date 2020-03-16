package com.company;

public class TextBox extends UIControl {
    private String text="";

    //public TextBox() {
        //super(false);
        //System.out.println("TextBox");
    //}
    @Override
    public String toString(){

        return text;
    }
    public void setText(String text) {

        this.text = text;
    }
    public void clear(){

        text="";
    }
    @Override
    public void render(){
        System.out.println("render TextBox");
    }
}
