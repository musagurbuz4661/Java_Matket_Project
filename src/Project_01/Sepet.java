package Project_01;

import java.util.Scanner;


public class Sepet {
    public static String toplamAlinanUrunler(){
        return Market.alinanUrunler + Sarkuteri.alinanUrunler +Manav.alinanUrunler;
    }

    public static double toplamOdenecekPara(){

        return (Market.toplamOdenecekPara + Manav.toplamOdenecekPara + Sarkuteri.toplamOdenecekPara);
    }

    public static void sepet() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Aldiginiz Urunler : "+toplamAlinanUrunler());
        System.out.printf("Toplam Odenecek ucret  : %.2f$\n ", toplamOdenecekPara());
        System.out.println("Alis verisinizi Tamamlamak ister misiniz? Y/N");
        String secim = scan.next();
        if (secim.equalsIgnoreCase("y")) {
            krediKartBilgileri();
            System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND+Renklendirme.ANSI_BLACK+"  Odemeniz Basarili bir sekil de yapilmistir  "+Renklendirme.ANSI_RESET);
            Thread.sleep(3000);

        } else if (secim.equals("N") || secim.equals("n")) {
            System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND+Renklendirme.ANSI_BLACK+"   Sectiginiz urunleri iptal edilmistir   "+Renklendirme.ANSI_RESET);
            Thread.sleep(3000);


        } else {
            System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND+Renklendirme.ANSI_BLACK+"lutfen 'Y' veya 'N' seciniz"+Renklendirme.ANSI_RESET);
            sepet();
        }


    }

    public static void projeyiDurdur() {
        System.out.println(Renklendirme.ANSI_YELLOW+"============================================================"+Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND+Renklendirme.ANSI_BLACK+" Basrilli Marketi ziyaret ettiginiz icin Tesekkur ederiz :) "+Renklendirme.ANSI_RESET);
        System.out.println(Renklendirme.ANSI_YELLOW+"============================================================"+Renklendirme.ANSI_RESET);
    }

    public static void krediKartBilgileri() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("adinizi giriniz :");
        String ad = scan.nextLine();
        System.out.println("soyAdinizi giriniz :");
        String soyAd = scan.nextLine();

        boolean flag=true;
        while (flag){
            System.out.println("kredi kart no girinizi :");
            String kartNo = scan.nextLine();
        if (kartNo.length() != 16) {
            System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND+Renklendirme.ANSI_BLACK+"Kredi karti 16 haneli olmalidir"+Renklendirme.ANSI_RESET);

        } else {


            ad = ad.charAt(0) + ad.replaceAll("\\w", "*");
            soyAd = soyAd.charAt(0) + soyAd.replaceAll("\\w", "*");

            kartNo = kartNo.substring(0,4).replaceAll("\\d","*")+" "+
                    kartNo.substring(4,8).replaceAll("\\d","*")+" "+
                    kartNo.substring(8,12).replaceAll("\\d","*")+" "+
                    kartNo.substring(12);


            System.out.println(ad + " " + soyAd);
            System.out.println("kartNo : " + kartNo);
            flag=false;

        }}
    }
}

