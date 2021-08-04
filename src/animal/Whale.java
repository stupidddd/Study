package animal;

public class Whale extends Animal implements Fish, Mammal {
    @Override
    public void printInformation() {
        System.out.println("我是鲸鱼！");
    }

    @Override
    public void move(){
        System.out.println("鲸鱼水里游！");
    }

    @Override
    public void eat(){
        System.out.println("鲸鱼吃东西！");
    }
}
