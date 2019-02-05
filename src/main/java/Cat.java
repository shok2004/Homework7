import java.lang.reflect.Field;

public class Cat {
    public String name;
    public String color;
    public int age;
    public static void main(String[] args) {
        try {
            Cat cat = new Cat();
            Field fieldName = cat.getClass().getField("name");
            fieldName.set(cat, "Murzik");
            Field fieldAge = cat.getClass().getField("age");
            System.out.println(fieldAge.get(cat));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}

