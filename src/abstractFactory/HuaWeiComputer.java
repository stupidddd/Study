package abstractFactory;

public class HuaWeiComputer implements Computer{
    public HuaWeiComputer() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("生产华为电脑");
    }
}
