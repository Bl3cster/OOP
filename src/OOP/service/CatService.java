package OOP.service;

import OOP.Cat;

public class CatService {
    public void pettingTheCat(Cat cat) {
        cat.setHappy(true);
        System.out.println("режим трактора активирован");
        System.out.println(cat);
    }
    public void gamingTheCat(Cat cat) {
        cat.setHappy(true);
        System.out.println("носится, царапается, счастливо орёт");
        System.out.println(cat);
    }
    public void teaseTheCat (Cat cat){
        cat.setHappy(false);
        System.out.println("носится, царапается, смотрит волком, орёт матом");
        System.out.println(cat);
    }
    public void feed(Cat cat, double weightEight) {
        cat.setWeight(cat.getWeight() + weightEight);
        cat.setHappy(true);
        System.out.println("Я покушала, мама!");
        System.out.println(cat);
    }
}
