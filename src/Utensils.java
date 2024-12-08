public class Utensils extends Market{

    public Utensils(String name){
        super(name);
    }

    @Override
    public void use() {
        System.out.println(name +" is using(Utensils)");
    }
    public void Break(){
        System.out.println(name+ " is breaking");
    }

}
