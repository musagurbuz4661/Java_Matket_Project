package Project_01;

import java.util.Scanner;

public class AnaSayfa {

    public static void main(String[] args) throws InterruptedException {
        bolumler();
    }
        public static void bolumler() throws InterruptedException {


        String secim;
        do {

            Scanner scan = new Scanner(System.in);

            System.out.println(Renklendirme.ANSI_YELLOW+"============================"+Renklendirme.ANSI_RESET);
            System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND+Renklendirme.ANSI_BLACK+" WELCOME TO BASRILLI MARKET "+Renklendirme.ANSI_RESET);
            System.out.println(Renklendirme.ANSI_YELLOW+"============================"+Renklendirme.ANSI_RESET);



            System.out.println("     MARKET BOLUMLERI    ");
            System.out.println(Renklendirme.ANSI_YELLOW+"============================"+Renklendirme.ANSI_RESET);

            System.out.println("     01  --- Manav");
            System.out.println("     02  --- Sarkuteri");
            System.out.println("     03  --- Market");

            System.out.println("     \"Q\" --- Cikis");


            System.out.println(Renklendirme.ANSI_YELLOW+"============================"+Renklendirme.ANSI_RESET);


            System.out.println(Renklendirme.ANSI_GREEN+"Hangi bolume gitmek istiyorsaniz numarasini giriniz : "+Renklendirme.ANSI_RESET);
            secim = scan.nextLine();


            switch (secim) {
                case "01":
                case "1":
                    MarketList.Market();
                    break;
                case "02":
                case "2":
                    MarketList.Sarkuteri();
                    break;
                case "03":
                case "3":
                    MarketList.Manav();
                    break;
                case "q":
                case "Q":
                    break;
                default:
                    System.out.println(Renklendirme.ANSI_YELLOW_BACKGROUND+Renklendirme.ANSI_BLACK+"lutfen gecerli bir numara giriniz. Eger cikmak isterseniz 'Q' ya basiniz"+Renklendirme.ANSI_RESET);
                    Thread Tread = null;
                    Tread.sleep(2000);
            }
        } while (!secim.equalsIgnoreCase("q"));
        Sepet.projeyiDurdur();

    }


}
