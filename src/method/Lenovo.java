package method;

public class Lenovo implements Computer {
    public Lenovo() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("生产Lenovo");
    }
}
