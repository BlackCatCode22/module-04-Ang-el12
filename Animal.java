import java.util.ArrayList;
import java.io.*;

public class Animal {
    String name;
    int age;
    String species;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    // Improved outputToFile method for neat and organized output
    public static void outputToFile(ArrayList<Animal> animals, String filename) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            writer.write("********** Zoo Animal List **********\n\n");
            for (Animal animal : animals) {
                writer.write("-----\n");
                writer.write("Species: " + animal.species + "\n");
                writer.write("Name: " + animal.name + "\n");
                writer.write("Age: " + animal.age + " year(s)\n");
                writer.write("-----\n\n");
            }
            writer.write("********** End of List **********\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Example animal objects
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Spot", 4, "Hyena"));
        animals.add(new Animal("Leo", 12, "Lion"));
        animals.add(new Animal("Hobbes", 7, "Tiger"));
        animals.add(new Animal("Ted", 1, "Bear"));

        // Output to file
        outputToFile(animals, "newAnimals.txt");
    }
}