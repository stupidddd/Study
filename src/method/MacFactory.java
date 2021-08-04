package method;

public class MacFactory implements ComputerFactory {
    @Override
    public Computer makeComputer() {
        return new Mac();
    }
}
