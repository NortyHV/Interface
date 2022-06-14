import java.util.ArrayList;

public class Cafe implements Service  {
    ArrayList<String> dishes;
    public Cafe() {
        dishes = new ArrayList<String>();
        dishes.add("salad");
    }


    public String cook(String eat) {
        for (String i : dishes) {
            if (i.equals(eat))
                return eat;
        }

        return "Блюдо не найдено";
    }

    @Override
    public String sell(float cash, String dishName) throws CheckedException {
        return null;
    }

    public void sale(int price) {

    }
}
