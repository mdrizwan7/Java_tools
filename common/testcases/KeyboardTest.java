import com.thinking.machines.util.*;
class KeyboardTest
{
public static void main(String []args)
{
Keyboard keyboard=new Keyboard();
char c;
System.out.print("Enter a Character : ");
c=keyboard.getCharacter();
String str=keyboard.getString("Enter a String : ");
long l=keyboard.getLong("Enter Long type : ");
int i=keyboard.getInt("Enter int type : ");
short s=keyboard.getShort("Enter Short type : ");
byte b=keyboard.getByte("Enter byte type : ");
double e=keyboard.getDouble("Enter Double type : ");
float w=keyboard.getFloat("Enter float type : ");
boolean a=keyboard.getBoolean("Enter bool : ");
System.out.println("Char : "+c);
System.out.println("String : "+str);
System.out.println("Long : "+l);
System.out.println("Int : "+i);
System.out.println("Short : "+s);
System.out.println("byte : "+b);
System.out.println("Double : "+e);
System.out.println("Float : "+w);
System.out.println("Bool : "+a);
}
}