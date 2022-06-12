import java.util.ArrayList;

public class Cooking implements Service {
    ArrayList<String> dishes;
    public Cooking() {
        dishes = new ArrayList<String>();
        dishes.add("cutlet");
    }

    public String cook(String eat) {
        for (String i : dishes) {
            if (i.equals(eat))
                return eat;
        }

        return "Блюдо не найдено";
    }

    public void sale(int price) {

    }
}
