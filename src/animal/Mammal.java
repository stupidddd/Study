package animal;

public interface Mammal {
    public abstract void printInformation();

    public default void move() {
        System.out.println("运动形式多样！");
    }

    public static void eat(){
        System.out.println("哺乳动物吃杂食！");
    }
}
