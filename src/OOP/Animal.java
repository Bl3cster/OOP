package OOP;

public abstract class Animal {
    private String name;
    private double weight;
    private String color;
    private boolean happy;

    public abstract void voice();
    public abstract double speed();


    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isHappy() {
        return happy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }
}
