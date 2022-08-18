package designpattern.template;

public abstract class Car {
    protected void addColour(String color) {
        System.out.println("Colour from the abstract class: " + color);
    };

    protected abstract void addEngine(String engine);

    protected abstract void setType(String type);

    protected final void make(String color, String engine, String type) {
        this.addColour(color);

        addEngine(engine);

        setType(type);
    }
}
