import com.thinking.machines.util.*;
class TMLinkedListTest
{
public static void main(String args[])
{
TMList list;
list=new TMLinkedList();
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
list.add(120);
list.add(130);
list.add(140);
System.out.println("List Size : "+list.size());
System.out.println("Printing List");
for(int i=0;i<list.size();i++) System.out.println(list.get(i));
System.out.println("Inserting at 0");
list.insert(0,11111);
System.out.println("Inserting at 15");
list.insert(15,151515);
System.out.println("Inserting at 14");
list.insert(14,141414);
System.out.println("Printing List");
for(int i=0;i<list.size();i++) System.out.println(list.get(i));
}
}