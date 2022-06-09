import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Service cafe = new Cafe();

        Service foodTrack = new FoodTrack();

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
