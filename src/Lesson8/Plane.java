package Lesson8;

public abstract class Plane {
    public static void main(String[] args) {

    }

    private String name;
    private int speed;
    private int places;
    private boolean isFighter;

    public Plane(String name, int speed, boolean isFighter) {

    }

    public void flight(){
        System.out.println("Лететь");
    }

    public void setName(String name){
        this.name = name;
    }

    public int getSpeed(){
        return speed;
    }
}
