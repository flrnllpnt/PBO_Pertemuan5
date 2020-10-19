package com.pboreg;

// class tanpa constructor / class polos
class Polos {
    String dataString;
    int dataInteger;
}
// class dengan constructor
class Mhsw {
    String name;
    String noinduk;
    String jrsan;

//    // constructor dipanggil saat object pertama kali dibuat
//    Mhsw() {
//        System.out.println("Ini adalah constructor");
//    }

    // consturctor dengan parameter
    Mhsw(String inputName, String inputnoinduk, String inputjrsan) {
        name = inputName;
        noinduk = inputnoinduk;
        jrsan = inputjrsan;

        System.out.println(name);
        System.out.println(noinduk);
        System.out.println(jrsan);
    }
}
public class Constructor {
    public static void main(String[] args) {

        Mhsw mhsw1 = new Mhsw("John", "13305041", "teknik perteknikan");
        Mhsw mhsw2 = new Mhsw("Doe", "13305042", "teknik pertambangan");


//        Polos objectPolos = new Polos();
//        objectPolos.dataString = "polos";
//        objectPolos.dataInteger = 0;
//
//        System.out.println(objectPolos.dataString);
//        System.out.println(objectPolos.dataInteger);
    }
}
