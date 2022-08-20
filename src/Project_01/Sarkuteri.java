package Project_01;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Sarkuteri {

    static List<String> urunListesi = new ArrayList<String>();
    static List<Double> urunFiyatlariListesi = new ArrayList<>();
    static List<Integer> UrunNoListesi = new ArrayList<>();


    public static double toplamOdenecekPara = 0;
    public static String alinanUrunler = "";

    static Scanner scan = new Scanner(System.in);


    public static void urunListesi() {

        System.out.println(Renklendirme.ANSI_YELLOW+                                   "========================="+Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND+Renklendirme.ANSI_BLACK+"  No    Urun       Fiyat "+Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_YELLOW+                                   "========================="+Renklendirme.ANSI_RESET);

        String urunler[] = {"Yumurta", "Sucuk", "Peynir", "Zeytin", "Tahin", "Pekmez", "Un", "Seker", "Salca"};
        double urunFiyatlari[] = {2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30};
        int UrunNo[] = { 1, 2, 3, 4, 5, 6, 7, 8,9};

        for (int i = 0; i < urunler.length; i++) {
            System.out.printf("  %-3d  %-10s %.2f $\n", UrunNo[i], urunler[i], urunFiyatlari[i]);
        }
        System.out.println(Renklendirme.ANSI_YELLOW+                                   "========================="+Renklendirme.ANSI_RESET);


        for (int i = 0; i < urunler.length; i++) {
            urunListesi.add(urunler[i]);
        }
        for (int i = 0; i < urunFiyatlari.length; i++) {
            urunFiyatlariListesi.add(urunFiyatlari[i]);
        }
        for (int i = 0; i < UrunNo.length; i++) {
            UrunNoListesi.add(UrunNo[i]);
        }
    }

    public static void urunSec() throws InterruptedException {

        int No = 0;
        boolean kontrol = true;
        while(kontrol) {
            try {
                scan = new Scanner(System.in);
                System.out.println("Lutfen istediginiz urun numarasini giriniz :");
                No = scan.nextInt();
                kontrol = false;
            } catch (InputMismatchException e) {
                System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND+Renklendirme.ANSI_BLACK+"Urun numarasi "+UrunNoListesi.get(0) +" ile "+UrunNoListesi.get(UrunNoListesi.size()-1) +" arasinda olmalidir "+Renklendirme.ANSI_RESET);
            }
        }
        double odencekFiyat = 0;
        if ((No < 0 || No > UrunNoListesi.size() - 1)) {
            System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND+Renklendirme.ANSI_BLACK+"Urun numarasi "+UrunNoListesi.get(0) +" ile "+UrunNoListesi.get(UrunNoListesi.size()-1) +" arasinda olmalidir "+Renklendirme.ANSI_RESET);

            urunSec();

        }

            for (int i = 0; i < UrunNoListesi.size(); i++) {

                if (No == UrunNoListesi.get(i)) {
                    System.out.println("Kac kilogram almak istiyorsunuz?");
                    double kilogram = scan.nextDouble();
                    odencekFiyat = (kilogram * urunFiyatlariListesi.get(i));
                    toplamOdenecekPara += odencekFiyat;
                    alinanUrunler += urunListesi.get(i) +", ";
                    System.out.printf("%.2f kg  %s  %.2f $\n", kilogram, urunListesi.get(i), odencekFiyat);


                    boolean flag=true;
                    while(flag){
                        System.out.println("Baska bir urun almak istermisiniz   Y / N");
                        String secim = scan.next();
                        if (secim.equals("Y") || secim.equals("y")) {
                            flag=false;
                            AnaSayfa.bolumler();
                            urunListesi();
                            urunSec();

                        } else if (secim.equals("N") || secim.equals("n")) {
                            flag=false;
                            Sepet.sepet();
                            break;



                        } else {
                            System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND+Renklendirme.ANSI_BLACK+"lutfen 'Y' veya 'N' seciniz"+Renklendirme.ANSI_RESET);

                        }}
                }
            }
        }
}

