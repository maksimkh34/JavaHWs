import java.util.Objects;
import java.util.Scanner;

public class View {
    private final Scanner consoleInput = new Scanner(System.in);
    public int getX()
    {
        System.out.print("Введите X: ");
        String possibleNumber = consoleInput.next();
        if(possibleNumber.matches("[-+]?\\d+"))
        {
            return Integer.parseInt(possibleNumber);
        }
        else {
            System.out.print("Число введено неверно. ");
            return getX();
        }
    }

    public int getY()
    {
        System.out.print("Введите Y: ");
        String possibleNumber = consoleInput.next();
        if(possibleNumber.matches("[-+]?\\d+"))
        {
            return Integer.parseInt(possibleNumber);
        }
        else {
            System.out.print("Число введено неверно. ");
            return getY();
        }
    }

    public String getOperation()
    {
        System.out.print("Установите операцию (+, -, /, %, *): ");
        String op = consoleInput.next();
        if(Objects.equals(op, "+") || Objects.equals(op, "-") ||
                Objects.equals(op, "/") || Objects.equals(op, "%") || Objects.equals(op, "*"))
        {
            return op;
        }
        else {
            System.out.println("\nОперация выбрана неверно.\n ");
            return getOperation();
        }
    }

    public void printResult(int a)
    {
        System.out.println("Результат: " + a);
    }

    public void impossibleOperationException()
    {
        System.out.println("Обнаружено деление на ноль или другая недопустимая операция.");
    }

}
