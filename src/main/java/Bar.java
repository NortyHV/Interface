import java.util.ArrayList;

public class Bar implements Service {
    ArrayList<String> dishes;
    public Bar() {
        dishes = new ArrayList<String>();
        dishes.add("nuts");
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
