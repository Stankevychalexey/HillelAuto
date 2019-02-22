package Lesson7;

public class Mushrooms {
    private String name;
    private int height;
    private String color;
    private int weight;

    public Mushrooms() {

    }

    private Mushrooms(String name) {
        this.name = name;
    }

    public Mushrooms(String name, int height) {
        this(name);
        this.height = height;
    }

    Mushrooms(String name, int height, int weight){
        this(name, height);
        this.weight = weight;
    }

    protected Mushrooms(String name, int height, int weight, String color){
        this(name, height, weight);
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
