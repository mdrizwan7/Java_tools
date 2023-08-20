import com.thinking.machines.util.*;
class TMArrayListTest
{
public static void main(String args[])
{
TMList list;
list=new TMArrayList();
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
for(int i=0;i<list.size();i++) System.out.println(list.get(i));
TMList list1=new TMLinkedList();
list.copyTo(list1);
System.out.println("Printing list1 contents");
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
}
}