package work1;

public class Hourse extends Pet{

    public Hourse(String name, int age, int height, String desripton) {
        super(name, age, height, desripton);
    }

    @Override
    public String toString() {
        return "Name: "+super.getName()+" Age: "+super.getAge()
                +" Height: "+super.getHeight()+" Description: "+super.getDesripton();
    }

    public void say(){
        System.out.println("ІІІІІІііхаааааааа");
    }
    public void work(){
        System.out.println("інь тягне віз щоб орати");
    }

}
