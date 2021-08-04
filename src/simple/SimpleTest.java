package simple;

public class SimpleTest {
    public static void main(String[] args) {
        ComputerFactory cf=new ComputerFactory();
        Computer c1=cf.makeComputer("Mac");
        Computer c2=cf.makeComputer("Lenovo");
    }
}
