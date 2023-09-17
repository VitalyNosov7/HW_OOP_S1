import java.time.LocalDate;
import java.util.List;

public class Turtle extends Animal {

    private String breed;

    public Turtle(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations,
            Color color, String breed) {
        super(name, weight, owner, birthDay, vaccinations, color);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

}
