import java.util.Scanner;

public class AddedForMenu {
    public static void addedmenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Elave etmek istediyin sey" +
                "  Yemek-->1" +
                "  Icki-->2");
        int elaveolunasi = sc.nextInt();
        sc.nextLine();
        if (elaveolunasi == 2) {
            System.out.print("Ickinin adini daxil edin: ");
            String name = sc.nextLine();
            System.out.print("Ickinin qiymetini daxil edin: ");
            double piece = sc.nextInt();
            Drink d = new Drink(name, piece);
            DataBase.drinks.add(d);
        } else if (elaveolunasi == 1) {
            System.out.print("Yemeyin adini daxil edin: ");
            String name = sc.nextLine();
            System.out.print("Yemeyin qiymetini daxil edin: ");
            double piece = sc.nextInt();
            Meal m = new Meal(name, piece);
            DataBase.meals.add(m);
        } else ;
    }
}
