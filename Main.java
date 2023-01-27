package kirill.tasks_oop.thirdTask;

public class Main {
    public static void main(String[] args) {
        Samsung s = new Samsung();
        iPhone i = new iPhone();
        Xiaomi x = new Xiaomi();
        s.call();
        s.restart();
        s.repaint("Brown");
        i.call();
        i.restart();
        x.call();
        x.restart();
    }
}
