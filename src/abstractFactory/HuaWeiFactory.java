package abstractFactory;

public class HuaWeiFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new HuaWeiPhone();
    }

    @Override
    public Computer makeComputer() {
        return new HuaWeiComputer();
    }
}
