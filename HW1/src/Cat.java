public class Cat {

    private String name = "Nameless cat";
    private Owner owner = null;
    private int age = 0;

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

    public void greet() {
        System.out.print("Мяу! Меня зовут " + name + ". Мне " + age + " ");
        if (age%10 == 1) {
            System.out.print("год. ");
        } else if (age%10 >= 2 && age%10 <= 4) {
            System.out.print("года. ");
        } else if (age%10 >= 5 || age%10 == 0) {
            System.out.print("лет. ");
        }
        if (owner != null) {
            System.out.println("Мой владелец - " + owner.name + ". ");
        }
        else {
            System.out.println();
        }
    }
    public Cat(String name, int age)
    {
        setAge(age);
        setName(name);
    }
    public Cat(String name, int age, Owner owner)
    {
        this(name, age);
        this.owner = owner;
    }

}
