/*
// Домашнее задание.
// Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм

// V    1. Добавить в класс Animal методы двигаться(toGo), летать(fly), плавать(swim).
// V    2. Создать по два класса наследника Animal, умеющих летать, плавать, бегать.
//      3. Добиться того, чтобы не умеющие летать не могли этого делать, либо как-то оповещали об этом пользователя.

// САМАЯ ВАЖНАЯ ЧАСТЬ:
// В файле readme.md в репозитории гитхаб описать
// какие проблемы в таком проектировании Вы увидели, а также там же написать возникшие при выполнении дз вопросы
// (если они есть)
*/


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Owner alex = new Owner("Alexey");
        Vaccination chumka = new Vaccination("chumka", LocalDate.of(2010, 12, 5));
        Animal barsik = new Cat("barsik", 10.0, alex, LocalDate.now(), List.of(chumka), Color.BLACK, "siamskiy");
        System.out.println(barsik.getName());
//        barsik.wakeUp();
        System.out.println(barsik.getVaccinations());
        barsik.setVaccinations(List.of(chumka, new Vaccination("столбняк", LocalDate.now())));
        System.out.println(barsik.getVaccinations());
        Dog barbos = new Dog("barbos", 10.0, alex, LocalDate.now(), List.of(chumka), Color.WHITE, "Такса");
        List<Animal> animals = new ArrayList<>(); // Список пациентов
        animals.add(barsik);
        animals.add(barbos);
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                System.out.println(((Cat) animal).getBreed());
            }
            System.out.println(animal.getName());
        }
       // ((Cat) barsik).getBreed();
//        System.out.println(barbos.getBreed());
//        System.out.println(((Cat)barsik).getBreed());
//        barsik.eat();
//        barsik.wakeUp();
//        barsik.findFood();
//        barsik.toPlay();
//        barsik.goToSleep();
//        barsik.lifeCycle();


//        System.out.println(barsik.getColor());
//        System.out.println(barbos.getColor());

//        System.out.println(Animal.getClass().getSimpleName());
//        Object


    }
}