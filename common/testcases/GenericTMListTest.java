import com.thinking.machines.util.*;
class GenericTMListTest
{
public static void main(String args[])
{
TMArrayList<Integer> list1=new TMArrayList<Integer>();
list1.add(10);
list1.add(20);
list1.add(30);
list1.add(40);
list1.add(50);
list1.forEach((m)->{System.out.println(m);});
System.out.println("*******************");
TMLinkedList<String> list2=new TMLinkedList<String>();
list2.add("Ujjain");
list2.add("Goa");
list2.add("Indore");
list2.add("Pune");
list2.add("Bangluru");
list2.forEach((j)->{System.out.println(j);});
}
}