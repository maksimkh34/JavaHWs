public class Presenter {
    private final Model model = new Model();
    private final View view = new View();

    public int calculate()
    {
        model.setA(view.getX());
        model.setB(view.getY());
        model.setOperation(view.getOperation());
        if(model.impossible())
        {
            view.impossibleOperationException();
            return -1;
        }
        view.printResult(model.execute());
        return 0;
    }
}
