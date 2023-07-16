public class Task1 {
    public static void main(String[] args) {
        Owner owner = new Owner();
        owner.name = "Иван";

        Cat first = new Cat("Мурзик", 1);
        Cat second = new Cat("Соня", 3);
        Cat third = new Cat("Пушистик", 10, owner);

        first.greet();
        second.greet();
        third.greet();
    }
}
