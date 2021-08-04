package abstractFactory;

public class HuaWeiPhone implements Phone {
    public HuaWeiPhone() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("生产华为手机");
    }
}
