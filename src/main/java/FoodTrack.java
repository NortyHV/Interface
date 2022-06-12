import java.util.ArrayList;

public class FoodTrack implements Service {
    ArrayList<String> dishes;

    public FoodTrack() {
        dishes = new ArrayList<String>();
        dishes.add("hotdog");
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
