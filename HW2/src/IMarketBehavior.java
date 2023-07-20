public interface IMarketBehavior {
    void addToQueue(Object o);
    void pop();
    void pass(Object o);
    void addOrder(Order order);
    void removeOrder(Order order);
}
