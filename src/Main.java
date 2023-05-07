import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MenyudaVarOlanlar.varolanlar();
        boolean run=true;
        while (run){
            System.out.println("""
                    Secim edin:
                    Menyunu gormek ucun-->1
                    Menyuya elaveler etmke ucun-->2
                    Sifaris qebul etmek ucun-->3
                    Masadaki sifarisleri gormek ucun-->4
                    Masanin hesabini cap etmek ucun-->5
                    Sonlandirma ucun-->0
                    """);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            int secim=sc.nextInt();
            switch (secim){
                case 1:
                    ShowInMenu.showmenu();
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    break;
                case 2:
                    AddedForMenu.addedmenu();
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    break;
                case 3:
                    Order.startorder();
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    break;
                case 4:
                    Order.showtable();
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    break;
                case 5:
                    Order.checktab();
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    break;
                case 0:
                    run=false;
                    break;
            }
        }

    }
}