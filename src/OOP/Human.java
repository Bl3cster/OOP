package OOP;

import OOP.Interface.Herbivores;
import OOP.Interface.Mammal;
import OOP.Interface.Predator;

public class Human extends Animal implements Mammal, Predator, Herbivores {
    @Override
    public void voice() {

    }

    @Override
    public double speed() {
        return 0;
    }

    @Override
    public void graze() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void jump() {

    }

    @Override
    public void multiply() {

    }

    @Override
    public void bite() {

    }

    @Override
    public void attack() {

    }
}
