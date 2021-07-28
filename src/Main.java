public class Main {
    public static void main(String[] args) {
        EvenThread Evennumber = new EvenThread("A");
        EvenThread Evennumber1 = new EvenThread("B");
        OddThread oddThread = new OddThread("C");
        OddThread oddThread1 = new OddThread("D");
        Evennumber.start();
        oddThread.start();
        Evennumber1.start();
        oddThread1.start();

    }
}
