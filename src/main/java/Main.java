import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Service cafe = new Cafe();

        Service foodTrack = new FoodTrack();
        try {
            foodTrack.sell(8,"Хот-дог");
            foodTrack.sell(5,"5");
        } catch (CheckedException e) {
            System.out.println("Словил ошибку" + e.toString());

        }

        try {
            foodTrack.sell(10,"5");
        } catch (CheckedException e) {
            System.out.println("Словил ошибку" + e.toString());

        }


        Service cooking = new Cooking();

        Service bar = new Bar();

        ArrayList<Service> services = new ArrayList<Service>();
        services.add(cafe);
        services.add(foodTrack);
        services.add(cooking);
        services.add(bar);
        for (Service i : services) {
            System.out.println(i);
        }



    }

}
