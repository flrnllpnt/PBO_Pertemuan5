package com.pboreg;

public class Bilangan {
    private int a = 10; //atribut ini tidak boleh diakses secara langsung dr luar classku
    private int b = 20; //atribut ini tidak boleh diakses secara langsung dr luar classku
    private int c = 30; //atribut ini tidak boleh diakses secara langsung dr luar classku

    public int tampilkanA() {
        return this.a;
    }
    public int tampilkanB() {
        return this.b;
    }
    public int tampilkanC() {
        return this.c;
    }
    public void inputA(int nilai) {
        this.a = nilai;
    }
    public void inputB(int nilai) {
        this.b = nilai;
    }
    public void inputC(int nilai) {
        this.c = nilai;
    }
    public void inputData(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int tambah() {
        int hasil = this.a + this.b + this.c;
        return hasil;
    }
    public int kurang() {
        int hasil = this.c - this.a;
        return hasil;
    }
    public int kali() {
        int hasil = this.b * this.c;
        return hasil;
    }
    public double bagi() {
        double hasil = this.c / this.a;
        return hasil;
    }
}

