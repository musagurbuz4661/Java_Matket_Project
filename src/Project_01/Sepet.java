package Project_01;

import java.util.Scanner;

public class Sepet {
    public static String toplamAlinanUrunler(){
        return Market.alinanUrunler + ", "+Sarkuteri.alinanUrunler + ", "+Manav.alinanUrunler;
    }

    public static double toplamOdenecekPara(){

        return (Market.toplamOdenecekPara + Manav.toplamOdenecekPara + Sarkuteri.toplamOdenecekPara);
    }

    public static void sepet() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Aldiginiz Urunler : "+toplamAlinanUrunler());
        System.out.printf("Toplam Odenecek ucret  : %.2f$\n ", toplamOdenecekPara());
        System.out.println("Alis verisinizi Tamamlamak ister misiniz? Y/N");
        String secim = scan.next();
        if (secim.equals("Y") || secim.equals("y")) {
            krediKartBilgileri();
            System.out.println("Odemeniz Basarili bir sekil de yapilmistir");
            projeyiDurdur();
        } else if (secim.equals("N") || secim.equals("n")) {
            System.out.println("Sectiginiz urunleri iptal edilmismir");
            System.out.println("cikis yapmak icin 'Q' ya bisiniz");
            String secimCik = scan.next();
            if (secimCik.equals("Q") || secimCik.equals("q")) {
                projeyiDurdur();


            }
        } else {
            System.out.println("Basrilli Marketi ziyaret ettiginiz icin Tesekkur ederiz");
            System.out.println("cikis yapmak icin 'Q' tusuna basiniz ");
            projeyiDurdur();
        }


    }

    public static void projeyiDurdur() {
        System.out.println("Basrilli Marketi ziyaret ettiginiz icin Tesekkur ederiz :)");
    }

    public static void krediKartBilgileri() {
        Scanner scan = new Scanner(System.in);
        System.out.println("adinizi giriniz :");
        String ad = scan.nextLine();
        System.out.println("soyAdinizi giriniz :");
        String soyAd = scan.nextLine();
        System.out.println("kredi kart no girinizi :");
        String kartNo = scan.nextLine();
        if (kartNo.length() < 16) {
            System.out.println("Kredi karti 16 haneli olmalidir ve her dort numaradan sonra bosluk birakiniz");
            krediKartBilgileri();
        } else {


            ad = ad.charAt(0) + ad.replaceAll("\\w", "*");
            soyAd = soyAd.charAt(0) + soyAd.replaceAll("\\w", "*");

            kartNo = kartNo.substring(0, 15).replaceAll("\\d", "*") + kartNo.substring(15, 19);

            System.out.println(ad + " " + soyAd);
            System.out.println("kartNo : " + kartNo);
        }
    }
}

