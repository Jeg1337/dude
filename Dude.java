import java.util.ArrayList;

class Dude {

    private ArrayList<Animal> animals = new ArrayList<>();

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public String alo() {
        String line = "";
        for(int i = 0; i < animals.size(); i++) {
            line += (animals.get(i).panic() + '\n');
        }
        return line;
    }
}
