package animal;

public interface Fish {
    public abstract void printInformation();

    public default void move() {
        System.out.println("水里游！");
        color();
        space();
    }

    public static void eat(){
        System.out.println("鱼吃杂食！");
        space();
    }

    private void color(){
        System.out.println("五颜六色！");
    }

    private static void space(){
        System.out.println("生活在水里！");
    }
}
