package abstractFactory;

public class XiaoMiComputer implements Computer {

    public XiaoMiComputer() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("生产小米电脑");
    }
}
