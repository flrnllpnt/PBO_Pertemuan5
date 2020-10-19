package com.pboreg;

public class Classku {
    //Atribute
    public int x = 5; //atribut ini tidak boleh diakses secara langsung dr luar classku
    int y = 15; //atribut ini dapat diakses secara langsung dr luar classku dalam 1 package
    private int z = 20; //atribut ini tidak boleh diakses secara langsung dr luar classku

    //method
    public int tampilkanz() {
        return this.z;
    }
}
