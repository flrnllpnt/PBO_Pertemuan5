package com.pboreg.ClassAttributes.ModifyAttriibutes2;

public class MyClass {
    final int x = 10;

    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        myObj.x = 25; // will generate an error: cannot assign value to a final variable
        System.out.println(myObj.x);
    }
}
