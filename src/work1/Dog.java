package work1;

public class Dog extends Pet{

    public Dog(String name, int age, int height, String desripton) {
        super(name, age, height, desripton);
    }
    public void say(){
        System.out.println("Гав гав гав ");
    }
    public void work(){
        System.out.println("Собакка охороняє ферму від грабіжників");
    }

    public String toString() {
        return "Name: "+super.getName()+" Age: "+super.getAge()
                +" Height: "+super.getHeight()+" Description: "+super.getDesripton();
    }
}
