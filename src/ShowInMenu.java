public class ShowInMenu {
    public static void showmenu(){
        for (Meal m : DataBase.meals){System.out.println(m);}
        for (Drink d : DataBase.drinks){System.out.println(d);}
    };
    public static void showonlymeals(){for (Meal m : DataBase.meals){System.out.println(m);}}
    public static void showonlydrinks(){for (Drink d : DataBase.drinks){System.out.println(d);}}

}
