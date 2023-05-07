import java.util.Scanner;

public class Order {
    public static void startorder() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masanin nomresini daxil edin: ");
        int masano = sc.nextInt();
        System.out.println("""
                Elave etmek istediyiniz: 
                Yemek-->1
                Icki-->2
                Sifarisi sonlandirmaq-->3
                """);
        int secim = sc.nextInt();
        sc.nextLine();
        if (secim == 1) {
            ShowInMenu.showonlymeals();
            System.out.print("Yemeyin adini daxil edin: ");
            String yemeyinadi = sc.nextLine();
            for (Meal m : DataBase.meals) {
                if (m.getName() .equals(yemeyinadi)) {
                    DataBase.ordermeal.put(m, masano);

                }
            }
        } else if (secim == 2) {
            ShowInMenu.showonlydrinks();
            System.out.print("Ickinin adini daxil edin: ");
            String ickininadi = sc.nextLine();
            for (Drink d : DataBase.drinks) {
                if (d.getName().equals(ickininadi)) {
                    DataBase.orderdrink.put(d, masano);
                }
            }

        }
    }

    public static void showtable() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hansi masani gormek isteyirsiniz: ");
        int secilenmasa = sc.nextInt();
        for (var entry : DataBase.ordermeal.entrySet()) {
            if (entry.getValue().equals(secilenmasa)) {
                System.out.println(entry.getKey());
            }
        }
        for (var entry : DataBase.orderdrink.entrySet()) {
            if (entry.getValue().equals(secilenmasa)) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static void checktab() {
        Scanner sc = new Scanner(System.in);
        double hesab = 0;
        System.out.print("Hansi masanin hesabini isteyirsiniz: ");
        int masano = sc.nextInt();
        for (var entry : DataBase.ordermeal.entrySet()) {
            if (entry.getValue().equals(masano)) {
                hesab = hesab + entry.getKey().piece;
            }
        }
        for (var entry : DataBase.orderdrink.entrySet()) {
            if (entry.getValue().equals(masano)) {
                hesab = hesab + entry.getKey().piece;
            }
        }
        System.out.println(hesab);
    }
}

