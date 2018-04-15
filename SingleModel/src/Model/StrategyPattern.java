package Model;
interface  SayHiBehavior{
    void sayHi();
}

interface RunBehavior{
    void run();
}
//通过接口将需要变化的方法单独编程

abstract class mChicken{
    private SayHiBehavior sayHiBehavior;
    private RunBehavior runBehavior;
    public void setSayHiBehavior(SayHiBehavior sayHiBehavior){
        this.sayHiBehavior=sayHiBehavior;
    }
    public void setRunBehavior(RunBehavior runBehavior){
        this.runBehavior=runBehavior;
    }
    public void performSayHi(){
        sayHiBehavior.sayHi();
    }
    public void peformRun(){
        runBehavior.run();
    }
    public abstract void show();
}
public class StrategyPattern
{
}
