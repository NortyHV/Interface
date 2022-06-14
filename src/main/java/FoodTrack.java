import java.util.ArrayList;

public class FoodTrack implements Service {
    ArrayList<String> dishes;

    public FoodTrack() {
        dishes = new ArrayList<String>();
        dishes.add("Хот-дог");
        dishes.add("Шаурма");
        dishes.add("Кока-кола");
        dishes.add("Семечки");
        dishes.add("Гамбургер");
    }

    public String cook(String eat) {
        for (String i : dishes) {
            if (i.equals(eat))
                return eat;
        }

        throw new NotCheckedException ("Блюдо не найдено");
    }

    public String sell(float cash, String dishName) throws CheckedException {
        if (cash - 4.75f < 1) {
            throw new CheckedException("Извините, нам на чай остаётся мало");
        }
        return cook(dishName);
    }


}
