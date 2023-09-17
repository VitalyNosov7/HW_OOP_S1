import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal {
    private String breed;

    public Fish(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color, String breed) {
        super(name, weight, owner, birthDay, vaccinations, color);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
