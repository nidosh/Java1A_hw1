package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Değişken isimlendirmeleri Java'da camelCase tekniğinde yazılır.
        String ortaMetin = "İlginizi çekebilir.";
        String altMetin = "Vade süresi";

        System.out.println("ortaMetin");
        System.out.println(ortaMetin);

        int vade = 12;

        double dolarDun = 27.97;
        double dolarBugun = 28.01;

        boolean dolarDustuMu = false;

        String okYonu = "";

        if(dolarBugun<dolarDun)
        {
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if(dolarBugun>dolarDun)
        {
            okYonu = "up.svg";
            System.out.println(okYonu);
        }
        else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }
        //array
        //gerçek hayatta bu veriler databaseden gelir :))

        String[] krediler = {"Hızlı Kredi","Maaşını HalkBank'tan Alanlar","Mutlu Emekli"};

        //System.out.println(krediler[0]);
        //System.out.println(krediler[1]);
        //System.out.println(krediler[2]);

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }

    }

}