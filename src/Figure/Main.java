package Figure;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Circle myCircle = new Circle(4);
        myCircle.calculateArea(myCircle.getRadius());
        myCircle.setColor(myCircle, Color.BLUE);
        myCircle.getColor();
    }

}
