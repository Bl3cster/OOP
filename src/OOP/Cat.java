package OOP;

import OOP.Interface.Mammal;
import OOP.Interface.Predator;

import java.util.Objects;

public class Cat extends Animal implements Mammal, Predator {
    private String breed = "Дворовый";
    public Cat(){
        setName("Вася");
        setWeight(5);
        setColor("Рыжий");
    }
    public Cat(String breed) {
        this.breed = breed;
        setName("Мурзик");
        setWeight(7);
        setColor("Серо-бурмалиновый с продресью");
    }

    public Cat(String breed, String name, double weight, String color) {
        this.breed = breed;
        setName(name);
        setWeight(weight);
        setColor(color);
    }
    public void lickingEggs() {
        System.out.println("чистые и шелковистые, вам на зависть!");
    }
    @Override
    public void voice() {
        System.out.println("Мяяяу!");
    }

    @Override
    public double speed() {
        return 3;
    }

    @Override
    public void sleep() {
        System.out.println("Везде, всегда, пока не спит хозяин");
    }

    @Override
    public void jump() {
        System.out.println("На занавески, ёлку, из-за угла");
    }

    @Override
    public void multiply() {
        System.out.println("В марте, громко и с матом");
    }

    @Override
    public void bite() {
        System.out.println("Неожиданно, из засады");
    }

    @Override
    public void attack() {
        System.out.println("Быстро, дерзко и тикать");
    }

    @Override
    public String toString() {
        String happy = isHappy() ? "счастлив" : "хочет жрать";
        return "Кот породы " + breed + ", зовут " + getName() + ", весит " + getWeight() + ", цвета " + getColor()
                + ", " + happy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(breed, cat.breed) && getName().equals(cat.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, getName());
    }
}
