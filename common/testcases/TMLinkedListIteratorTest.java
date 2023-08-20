import com.thinking.machines.util.*;
class TMLinkedListIteratorTest
{
public static void main(String args[])
{
TMList list=new TMLinkedList();
list.add(111);
list.add(222);
list.add(333);
list.add(444);
list.add(555);
list.add(666);
list.add(777);
list.add(888);
list.add(999);
list.add(1010);
list.add(1212);
TMIterator k=list.iterator();
int i;
while(k.hasNext())
{
i=k.next();
System.out.println(i);
}

}
}