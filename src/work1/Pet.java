package work1;

public abstract class Pet {
    private String name;
    private int age;
    private int height;
    private String desripton;

    public abstract void say();
    public abstract void work();

    public Pet(String name, int age, int height, String desripton) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.desripton = desripton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getDesripton() {
        return desripton;
    }

    public void setDesripton(String desripton) {
        this.desripton = desripton;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", desripton='" + desripton + '\'' +
                '}';
    }
}
