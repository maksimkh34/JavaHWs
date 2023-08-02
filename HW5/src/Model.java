import java.util.Objects;

public class Model {
    int a = 0;
    int b = 0;
    String operation;

    public void setA(int a)
    {
        this.a = a;
    }

    public void setB(int b)
    {
        this.b = b;
    }

    public void setOperation(String op)
    {
        this.operation = op;
    }

    public int execute()
    {
        switch (operation) {
            case "+" -> {
                return a + b;
            }
            case "-" -> {
                return a - b;
            }
            case "*" -> {
                return a * b;
            }
            case "/" -> {
                return a / b;
            }
            case "%" -> {
                return a % b;
            }
        }
        return 0;
    }

    public boolean impossible()
    {
        return (Objects.equals(operation, "/") || Objects.equals(operation, "%")) && b == 0;
    }
}
