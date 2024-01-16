import java.util.ArrayList;
import java.util.HashMap;

public class AnimalFarm {
    ArrayList<String> farmAnimals;



    public AnimalFarm(ArrayList<String> farmAnimals) {
        this.farmAnimals = farmAnimals;
    }


    public HashMap<String,Integer> countedAnimals(){ // Задание №1
        HashMap<String, Integer> resultCountedAnimals = new HashMap<>();
        String animalErr = "";
        try {
            for (String animal : farmAnimals) {
                String[] animals = animal.split(" ");
                animalErr = animal;
                String animalSpeciesTUC = animals[0].toUpperCase();
                Animal.valueOf(animalSpeciesTUC);// тригер для try/catch
                if (!resultCountedAnimals.containsKey(animalSpeciesTUC)) {
                    resultCountedAnimals.put(animalSpeciesTUC, 1);
                } else {
                    Integer animalsCount = resultCountedAnimals.get(animalSpeciesTUC)+1;
                    resultCountedAnimals.put(animalSpeciesTUC, animalsCount);
                }
            }
        }catch(IllegalArgumentException exception){
            System.out.println("Please correct string ["+animalErr+"]. Incorrect input data.");
        }
        return resultCountedAnimals;
    }

    public ArrayList<String> uniqueNames(){// Задание №2
        ArrayList<String> result = new ArrayList<>();
        String animalErr = "";
        try {
            for (String animal : farmAnimals) {
                String[] animals = animal.split(" ");
                animalErr = animal;
                if (!result.contains(animals[1])) {
                    result.add(animals[1]);
                }
            }
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Please correct string ["+animalErr+"]. Incorrect input data.");
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
        farmAnimals.add(Animal.NOT_DEFINED.name() + " " + animalName);
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
