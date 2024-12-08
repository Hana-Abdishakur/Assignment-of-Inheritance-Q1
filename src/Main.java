public class Main {

    public static void main(String[]args){
        Utensils u = new Utensils("Forks");
        Knife k = new Knife("Chef's knife");
        Vegetables v = new Vegetables("Tomatoes");

        u.buy();
        u.use();
        u.Break();
        System.out.println();

        k.buy();
        k.use();
        k.cut();
        System.out.println();

        v.buy();
        v.use();
        v.eat();
    }

}