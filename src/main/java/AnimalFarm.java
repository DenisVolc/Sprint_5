import java.util.ArrayList;
import java.util.HashMap;

public class AnimalFarm {
    ArrayList<String> farmAnimals;

    public AnimalFarm(ArrayList<String> farmAnimals) {
        this.farmAnimals = farmAnimals;
    }
    public HashMap<String,Integer> countedAnimals(ArrayList<String> farmAnimals){
        HashMap<String, String> animalsAndItNames = new HashMap<>();
        for(String animal : farmAnimals){
            String[] animalName= animal.split(" ");
            animalsAndItNames.put(animalName[0],animalName[1]);
        }
        return;
    }
}
