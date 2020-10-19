package com.pboreg;


class Mahasisw {
    // Data member
    String namaa = "nama asli";
    String Ninduk;

    // constructor
    Mahasisw(String namaa, String Ninduk) {
        this.namaa = namaa;
        this.Ninduk = Ninduk;
    }

    // method tanpa return dan tanpa parameter
    void show() {
        System.out.println("Nama : " + this.namaa);
        System.out.println("NIM  : " + this.Ninduk);
    }
    // method tanpa return dan dengan parameter
    void setNamaa(String namaa) {
        this.namaa = namaa;
    }
    // method dengan return tapi tidak ada parameter
    String getNamaa() {
        return this.namaa;
    }
    String getNinduk() {
        return this.Ninduk;
    }

    // method dengan return dan dengan parameter
    String sayHi(String messege) {
        return messege + " juga, nama saya adalah " + this.namaa;
    }
}

public class JavaMethod {
    public static void main (String[] args) {
        Mahasisw mahasisw1 = new Mahasisw("John","19201367");
        // method
        mahasisw1.show();
        mahasisw1.setNamaa("tutung");
        mahasisw1.show();

        System.out.println(mahasisw1.getNamaa());
        System.out.println(mahasisw1.getNinduk());

        String data = mahasisw1.sayHi("ganteng");
        System.out.println(data);

    }
}
