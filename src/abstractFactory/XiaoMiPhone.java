package abstractFactory;

public class XiaoMiPhone implements Phone {
    public XiaoMiPhone() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("生产小米手机");
    }
}
