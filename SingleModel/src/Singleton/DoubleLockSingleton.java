package Singleton;

import javax.swing.*;

public class DoubleLockSingleton
{
    //当一个共享变量被volatile修饰时，它会保证修改的值会立即被更新到主存，
    // 当有其他线程需要读取时，它会去内存中读取新值。
    //volite用来保证可见性Lock sychronized
    private volatile static DoubleLockSingleton singleton;//易变的
    private DoubleLockSingleton(){}
    public static DoubleLockSingleton getSingleton(){
        if(singleton==null){
            synchronized (DoubleLockSingleton.class){
                if(singleton==null){
                    singleton=new DoubleLockSingleton();
                }
            }
        }
        return singleton;
    }


}
