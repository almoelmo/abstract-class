package kirill.tasks_oop.thirdTask;

public class iPhone extends Telephone{

    @Override
    public void call() {
        System.out.println("iPhone calling somebody");
    }

    @Override
    public void restart() {
        System.out.println("iPhone was restarted");
    }
}
