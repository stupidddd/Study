package abstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory xm=new XiaoMiFactory();
        AbstractFactory hw=new HuaWeiFactory();
        xm.makeComputer();
        xm.makePhone();
        hw.makeComputer();
        hw.makePhone();
    }
}
