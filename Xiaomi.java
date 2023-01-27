package kirill.tasks_oop.thirdTask;

public class Xiaomi extends Telephone{
    @Override
    public void call() {
        System.out.println("Xiaomi calling somebody");
    }

    @Override
    public void restart() {
        System.out.println("Xiaomi was restarted");
    }
}
