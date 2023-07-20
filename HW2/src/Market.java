import java.util.ArrayList;

public class Market implements IMarketBehavior, IQueueBehaviour {
    ArrayList<Order> orders = new ArrayList<>();
    ArrayList<Object> Queue = new ArrayList<>();
    @Override
    public void addQueuing(Object o) {
        Queue.add(o);
    }

    @Override
    public void removeFirst() {
        Queue.remove(0);
    }

    @Override
    public void removeLast() {
        Queue.remove(Queue.size()-1);
    }

    @Override
    public void addToQueue(Object o) {
        addQueuing(o);
    }

    @Override
    public void pop() {
        removeLast();
    }

    @Override
    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public void pass(Object o)
    {
        removeFirst();
    }

    void update(Order order)
    {
        if(orders.contains(order))
        {
            orders.remove(order);
        }
        else {
            orders.add(order);
        }
    }


}
