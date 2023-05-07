public class MenyudaVarOlanlar {
    public static void varolanlar(){
        Meal m=new Meal("Straqonof",10);
        DataBase.meals.add(m);
        Drink d=new Drink("Moxito",5);
        DataBase.drinks.add(d);
    }
}
