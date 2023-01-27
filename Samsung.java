package kirill.tasks_oop.thirdTask;

public class Samsung extends Telephone{

    @Override
    public void call() {
        System.out.println("Samsung calling somebody");
    }

    @Override
    public void restart() {
        System.out.println("Samsung was restarted");
    }
}
