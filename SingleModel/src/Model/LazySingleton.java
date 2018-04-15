package Model;

public class LazySingleton
{
    //懒汉单例模式
    //在类加载的时候,不创建实例,因此类加载速度快,运行时获取对象慢


    //静态私有成员
    private static LazySingleton instance=null;

    private LazySingleton(){
        //私有构造函数
    }

    public static synchronized  LazySingleton getInstance(){
        //静态,同步,公开访问点
        if(instance==null){
            instance=new LazySingleton();
        }
        return instance;
    }
}
