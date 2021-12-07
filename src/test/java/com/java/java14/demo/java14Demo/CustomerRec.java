package com.java.java14.demo.java14Demo;

public record CustomerRec(String firstName, String lastName) {
    public String getName(){
        return firstName()+lastName();
    }
}
