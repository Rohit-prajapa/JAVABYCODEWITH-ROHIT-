class GoodMorning1 extends Thread {

    public void run() {
        System.out.println("Hello Rohit Good Morning");
    }
}

class Welcome extends Thread {

    public void run() {
        System.out.println("Happy to see you!");

        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Prectics76 {

    public static void main(String[] args) {

        GoodMorning1 g = new GoodMorning1();
        g.start();

        Welcome w = new Welcome();
        w.start();
    }
}