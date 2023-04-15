package OOP;

import OOP.Interface.Arachnids;
import OOP.Interface.Herbivores;
import OOP.Interface.Mammal;
import OOP.Interface.Predator;

public class SpiderMan extends Human implements Arachnids{
    private final static String NAME = "Peter Parker";
    @Override
    public void voice() {
    }

    @Override
    public double speed() {
        return 0;
    }

    @Override
    public void spinAWeb() {

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
        System.out.println("Только с Мерри Джейн");
    }

    @Override
    public void attack() {

    }
}
