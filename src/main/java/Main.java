import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] arg){
        ArrayList<String> zooAnimals = new ArrayList<>(Arrays.asList(
                "CAT Murka",
                "Dog bobik",
                "HORSE bobik",
                "Dog sharik",
                "DOG barbos",
                "do Palkan"
        ));

        AnimalFarm zoo = new AnimalFarm(zooAnimals);
        zoo.addAnimal(Animal.COW,"Burenka");
        zoo.addAnimal(Animal.HORSE);
        zoo.addAnimal("name");
//        System.out.println("Зоопарк: " + zooAnimals);
        System.out.println("Результат первого задания: " + zoo.countedAnimals());
        System.out.println("Результат второго задания: " + zoo.uniqueNames());
        System.out.println(zoo);
    }
}
