package core.basesyntax;

/**
 * <p>Дан класс Rectangle. Переопределите в нем методы equals() и hashCode() так, чтобы equals()
 * сравнивал экземпляры Rectangle по содержимому полей color, width и length,
 * а hashCode() был бы согласованным с реализацией equals().</p>
 */
public class Rectangle {
    private Integer width;
    private Integer length;
    private String color;

    public Rectangle(Integer width, Integer length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Rectangle rectangle = (Rectangle) obj;
        return width.equals(rectangle.width)
                && length.equals(rectangle.length)
                && color.equals(rectangle.color);
    }

    @Override
    public int hashCode() {
        int primary = 43;
        int result = primary + (color == null ? 0 : color.hashCode());
        result = primary * result + (width == null ? 0 : width.hashCode());
        result = primary * result + (length == null ? 0 : length.hashCode());
        return result;
    }
}
