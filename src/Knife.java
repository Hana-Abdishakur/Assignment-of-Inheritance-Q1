public class Knife extends Utensils{

    public Knife(String name){
        super(name);
    }

    public void cut(){
        System.out.println(name +" is cutting");
    }
}
