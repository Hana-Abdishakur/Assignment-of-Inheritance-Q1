public class Market {

    protected String name;

    public  Market(String name){
        this.name = name;
    }

    public void buy(){
        System.out.println(name + " is buying");
    }

    public void use(){
        System.out.println(name+ " is using");
    }

}
