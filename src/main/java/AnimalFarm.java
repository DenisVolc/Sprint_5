import java.util.ArrayList;
import java.util.HashMap;

public class AnimalFarm {
    private ArrayList<String> farmAnimals;

    public AnimalFarm(ArrayList<String> farmAnimals) {
        this.farmAnimals = farmAnimals;
    }

    public HashMap<String,Integer> countedAnimals(){ // Задание №1
        HashMap<String, Integer> resultCountedAnimals = new HashMap<>();
            for (String animal : farmAnimals) {
                try {
                    String[] animals = animal.split(" ");
                    Animal animalSpecies = Animal.valueOf(animals[0].toUpperCase());
                    if (!resultCountedAnimals.containsKey(animalSpecies.name())) {
                        resultCountedAnimals.put(animalSpecies.name(), 1);
                    } else {
                        Integer animalsCount = resultCountedAnimals.get(animalSpecies.name()) + 1;
                        resultCountedAnimals.put(animalSpecies.name(), animalsCount);
                    }
                }catch(IllegalArgumentException exception) {
                    System.out.println("Please correct string [" + animal + "]. Incorrect input data.");
                }
            }
        return resultCountedAnimals;
    }

    public ArrayList<String> uniqueNames(){// Задание №2
        ArrayList<String> result = new ArrayList<>();
            for (String animal : farmAnimals) {
                try {
                String[] animals = animal.split(" ");
                if (!result.contains(animals[1])) {
                    result.add(animals[1]);
                }
                }catch(ArrayIndexOutOfBoundsException exception){
                    System.out.println("Please correct string ["+animal+"]. Incorrect input data.");
                }
            }
        return result;
        }

    public void addAnimal(Animal animalSpecies, String animalName){//Задание №3.1
        farmAnimals.add( animalSpecies.name() + " " + animalName );
    }

    public void addAnimal(Animal animalSpecies){//Задание №3.2Вид_животного Имя_животного
        farmAnimals.add(animalSpecies.name() + " N");
    }

    public void addAnimal(String animalName){//Задание №3.2
        farmAnimals.add(Animal.NOT_DEFINED + " " + animalName);
    }
    @Override
    public String toString() { //Задание №4
        StringBuilder result = new StringBuilder();
        for (String animal : farmAnimals) {
            result = result.append(animal).append("\n");
        }
        return result.toString();
    }
}
