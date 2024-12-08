public class Vegetables extends Market {

    public Vegetables(String name){
        super(name);
    }

    @Override
    public void use() {
        System.out.println(name + " is using(Vegatables)");
    }
    public void eat(){
        System.out.println(name + " is eating");
    }
}
