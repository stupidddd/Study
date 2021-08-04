package animal;

public class FishTest {
    public static void main(String[] args) {
        Fish f1=new Shark();
        Fish f2=new Whale();
        f1.printInformation();
        f1.move();
        f2.printInformation();
        f2.move();
        Fish.eat();
        Mammal.eat();
    }
}
