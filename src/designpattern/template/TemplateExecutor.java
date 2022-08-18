package designpattern.template;

public class TemplateExecutor extends Car {
    @Override
    protected void addColour(String color) {

        System.out.println("Colour from main class: " + color);
        super.addColour(color);
    }

    @Override
    protected void addEngine(String engine) {
        System.out.println(engine);
    }

    @Override
    protected void setType(String type) {
        System.out.println(type);
    }

    public static void main(String[] args) {
        TemplateExecutor executor = new TemplateExecutor();
        executor.make("Red", "4 cylender", "SUV");
    }
}
