import java.util.ArrayList;

class Dude {

    private String name;

    private ArrayList<Animal> animals = new ArrayList<>();

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public Dude(String value) {
        name = value;
    }

    public Dude() {
        
    }

    public String alo() {
        String line = "";
        for(int i = 0; i < animals.size(); i++) {
            line += (animals.get(i).panic() + '\n');
        }
        return line;
    }
}
