package method;

public class Mac implements Computer {
    public Mac() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("生产Mac");
    }
}
