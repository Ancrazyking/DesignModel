package Model;

public class EagerSingleton
{
    //饿汉单例模式
    //类加载较慢,但获取对象速度快

    private static EagerSingleton instance=new EagerSingleton();

    private EagerSingleton(){
        //私有构造器
    }

    public static EagerSingleton getInstance(){
        //静态,不同步
        return instance;
    }
}
