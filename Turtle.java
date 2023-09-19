import java.time.LocalDate;
import java.util.List;

public class Turtle extends Animal {

    private String breed;

    public Turtle(String name,
                double weight,
                Owner owner,
                LocalDate birthDay, 
                List<Vaccination> vaccinations,
                Color color,
                Boolean flyingAnimal,
                String breed) {
        super(name, weight, owner, birthDay, vaccinations, color, flyingAnimal);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

}
