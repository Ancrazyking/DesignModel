package Model;
//设计原则
//找出应用中可能需要变化之处，把它们独立出来，不要和那些不需要变化的代码混在一起。

abstract class Chicken
{

    public void sayHi()
    {
        System.out.println("咯咯咯!");
    }

    public void run()
    {
        System.out.println("跑吧!");
    }

    public abstract void show();
}

class WhiteChicken extends Chicken
{
    @Override
    public void show()
    {
        System.out.println("白色");
    }
}

class BlackChicken extends Chicken
{
    @Override
    public void show()
    {
        System.out.println("黑色");
    }
}

class ScreamChicken extends Chicken
{
    @Override
    public void sayHi()
    {
        System.out.println("嗷嗷嗷!");
    }

    @Override
    public void show()
    {
        System.out.println("黄色");
    }

    @Override
    public void run(){
        System.out.println("我不会跑!咯咯咯");
    }
}
public class CommonChicken
{
    public static void main(String [] args){
        Chicken wc=new WhiteChicken();
        wc.sayHi();
        wc.show();
        wc.run();

        Chicken bc=new BlackChicken();
        bc.sayHi();
        bc.show();
        bc.run();

        Chicken sc=new ScreamChicken();
        sc.sayHi();
        sc.show();
        sc.run();

    }
}
