package method;

public class MethodTest {
    public static void main(String[] args) {
        ComputerFactory lcf=new LenovoFactory();
        ComputerFactory mcf=new MacFactory();
        lcf.makeComputer();
        mcf.makeComputer();
    }
}
