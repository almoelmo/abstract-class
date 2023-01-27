package kirill.tasks_oop.thirdTask;

public abstract class Telephone {

    private String model;
    private String color;
    private int age;

    public abstract void call();

    public abstract void restart();

    public void repaint(String newColor){
        this.color = newColor;
    }
}
