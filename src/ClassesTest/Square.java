package ClassesTest;

public class Square extends Figure {

  private double width;
  private double height;

  public Square(double width, double height) {
    super(width, height); // в класс-наследник передаются данные из родительского класса;
    this.width = width;
    this.height = height;
  }

  @Override
  public double getArea() {
    return width * height; // в переопределённом методе будем выполнять умножение ширины на высоту
  }
}
