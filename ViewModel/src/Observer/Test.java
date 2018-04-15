package Observer;

import java.util.ArrayList;
import java.util.List;

interface  Person{
    void getMessage(String s);
}
class LaoWang implements Person{

    private String name="老王";
    @Override
    public void getMessage(String s)
    {
        System.out.println(name+"接到了小美打来的电话,电话内容是:"+s);
    }
}
class LaoLi implements Person{

    private String name="老李";
    @Override
    public void getMessage(String s)
    {
        System.out.println(name+"接到了小美打来的电话,电话内容是:"+s);
    }
}
 class XiaoMei{
    List<Person> list=new ArrayList<Person>();
    public XiaoMei(){

    }
    public void addPerson(Person person){
        list.add(person);
    }

    //遍历list,把自己的通知发送给所有人
    public void notifyPerson(){
        for(Person person:list){
            person.getMessage("大家好,我系古天乐,我系渣渣辉,是兄弟就来贪玩蓝月砍我吧!");
        }
    }
}
public class Test
{
    XiaoMei xiao_mei=new XiaoMei();


}
