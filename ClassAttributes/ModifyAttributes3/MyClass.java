package com.pboreg.ClassAttributes.ModifyAttributes3;

public class MyClass {
    int x = 5;

    public static void main(String[] args) {
        MyClass myObj1 = new MyClass(); // Object 1
        MyClass myObj2 = new MyClass(); // Object 2
        myObj2.x = 25;
        System.out.println(myObj1.x); // Output 5
        System.out.println(myObj2.x); // Output 25
    }
}
