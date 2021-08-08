package work1;

public  class Cow extends Pet{

    private int a ;
    public Cow(String name, int age, int height, String desripton) {
        super(name, age, height, desripton);

    }

    @Override
    public String toString() {
        return "Name: "+super.getName()+" Age: "+super.getAge()
                +" Height: "+super.getHeight()+" Description: "+super.getDesripton();
    }

    public void say(){
        System.out.println("Муууууууумумуму");
    }
    public void work(){
        System.out.println("Корова дає молоко");
    }


}

