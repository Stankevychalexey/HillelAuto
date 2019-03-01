package Figure;

public interface Constants {
    double PI = 3.1415926; // public static final  по умолчанию

    default void setColor(Object o, Color color) throws NoSuchFieldException, IllegalAccessException {
        o.getClass().getField("color").set(o, color);
    }
}
