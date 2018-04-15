package factory;

class Car
{
    public void driven()
    {
        System.out.println("开车");
    }
}

class jili extends Car
{
    public jili()
    {
        System.out.println("吉利车");
    }

    @Override
    public void driven()
    {
        System.out.println("吉利车开车");
    }
}

class qirui extends Car
{
    public qirui()
    {
        System.out.println("奇瑞");
    }

    @Override
    public void driven()
    {
        System.out.println("奇瑞开车");
    }
}

//假如我想要qirui的实例,new一个就行,生产其他车也要写driven方法,不如建一个工厂
public class CarFactory
{
    public static Car CreateFactory(String carname)
    {
        if("jili".equals(carname)){
            return new jili();

        }else if("qirui".equals(carname)){
            return new qirui();
        }
        return null;
    }

}
