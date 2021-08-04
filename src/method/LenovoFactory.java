package method;

public class LenovoFactory implements ComputerFactory {
    @Override
    public Computer makeComputer() {
        return new Lenovo();
    }
}
