package Lesson8;

public class TransportPlane extends Plane{

    public TransportPlane(String name, int speed, boolean isFighter) {
        super(name, speed, isFighter);
    }

    @Override
    public void flight(){
        System.out.println("Транспортный летит");
    }


}
