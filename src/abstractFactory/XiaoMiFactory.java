package abstractFactory;

public class XiaoMiFactory implements AbstractFactory {

    @Override
    public Phone makePhone() {
        return new XiaoMiPhone();
    }

    @Override
    public Computer makeComputer() {
        return new XiaoMiComputer();
    }
}
