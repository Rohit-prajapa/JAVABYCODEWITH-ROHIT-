abstract class Telephone {
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class Smartphone extends Telephone {

    @Override
    void ring() {
        System.out.println("Phone is ringing...");
    }

    @Override
    void lift() {
        System.out.println("Phone is lifting...");
    }

    @Override
    void disconnect() {
        System.out.println("Call disconnected...");
    }
}

public class Main {
    public static void main(String[] args) {

        Telephone t = new Smartphone();

        t.ring();
        t.lift();
        t.disconnect();
    }
}