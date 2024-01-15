import java.util.ArrayList;
import java.util.HashMap;

public class AnimalFarm {
    ArrayList<String> farmAnimals;

    public AnimalFarm(ArrayList<String> farmAnimals) {
        this.farmAnimals = farmAnimals;
    }

    public HashMap<String,Integer> countedAnimals(ArrayList<String> farmAnimals){ // Задание №1
        HashMap<String, Integer> resultCountedAnimals = new HashMap<>();
        try {
            //        HashMap<String, String> animalsAndItNames = new HashMap<>();
            for (String animal : farmAnimals) {
                String[] animalName = animal.split(" ");
//            animalsAndItNames.put(animalName[0],animalName[1]);
                String animalNameTUC = animalName[0].toUpperCase();
                Animal.valueOf(animalNameTUC);// тригер для try/catch
                if (!resultCountedAnimals.containsKey(animalName[0])) {
                    resultCountedAnimals.put(animalName[0], 1);
                } else {
                    Integer animalsCount = resultCountedAnimals.get(animalName[1] + 1);
                    resultCountedAnimals.put(animalName[0], animalsCount);
                }
            }
        }catch(IllegalArgumentException exception){
            System.out.println("Please correct string [Здесь вывести полностью ошибочную строку]. Incorrect input data.");
        }
        return resultCountedAnimals;
    }
    public void addAnimal(Animal animalSpecies, String animalName){//Задание №3.1
        farmAnimals.add( animalSpecies.name() + " " + animalName );
    }

    public void addAnimal(Animal animalSpecies){//Задание №3.2
        farmAnimals.add(animalSpecies.name() + " N");
    }

    public void addAnimal(String animalName){//Задание №3.2
        farmAnimals.add(Animal.NOT_DEFINED.name() + " " + animalName);
    }
    @Override
    public String toString(){ //Задание №4
        return "Вид_животного Имя_животного";
    }
}
