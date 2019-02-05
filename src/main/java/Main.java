import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        Class catClass = Cat.class;
        Field f = catClass.getDeclaredField("name");
    }

}
