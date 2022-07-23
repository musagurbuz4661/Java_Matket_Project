package Project_01;

import java.util.Scanner;

public class AnaSayfa {

    public static void main(String[] args) {
        bolumler();
    }
        public static void bolumler() {


        String secim;
        do {

            Scanner scan = new Scanner(System.in);

            System.out.println(" ==========================");
            System.out.println(" WELCOME TO BASRILLI MARKET");
            System.out.println(" ==========================");


            System.out.println("     MARKET BOLUMLERI    ");
            System.out.println(" ========================");

            System.out.println(" 01 ---Manav");
            System.out.println(" 02 ---Sarkuteri");
            System.out.println(" 03 ---Market");

            System.out.println("\"Q\" ---Cikis");


            System.out.println(" ========================");


            System.out.println("Hangi bolume gitmek istiyorsaniz numarasini giriniz : ");
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
                    System.out.println("lutfen gecerli bir numara giriniz. Eger cikmak isterseniz 'Q' ya basiniz");
            }
        } while (!secim.equalsIgnoreCase("q"));
        Sepet.projeyiDurdur();

    }


}
