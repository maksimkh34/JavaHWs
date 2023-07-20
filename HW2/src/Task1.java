public class Task1 {
    public static void main(String[] args)
    {
        Market main = new Market();

        main.addToQueue(null);
        main.addToQueue(null); // Добавляем "людей" в очередь
        main.addToQueue(null);

        main.pop();

        Order order = new Order();

        order.id = 1;
        main.addOrder(order);

        order.id = 2;
        main.addOrder(order);

        order.id = 3;
        main.addOrder(order);

        order.id = 2;
        main.removeOrder(order);

        System.out.print("-");
    }
}
