import java.text.DecimalFormat;

public class Rectangle {
    float width = 0;
    float height = 0;

    Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    Rectangle()
    {
        this(5, 7);
    }

    public String getHeight() {
        return new DecimalFormat("#0.00").format(height);
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getWidth() {
        return new DecimalFormat("#0.00").format(width);
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float calculateArea()
    {
        return width * height;
    }

    public float calculatePerimeter()
    {
        return (width + height) * 2f;
    }

}
