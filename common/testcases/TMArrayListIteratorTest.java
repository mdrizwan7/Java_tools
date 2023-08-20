import com.thinking.machines.util.*;
class TMArrayListIteratorTest
{
public static void main(String args[])
{
TMList list=new TMArrayList();
list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);
list.add(60);
list.add(70);
list.add(80);
list.add(90);
list.add(100);
list.add(110);
TMIterator k=list.iterator();
int i;
while(k.hasNext())
{
i=k.next();
System.out.println(i);
}
}
}