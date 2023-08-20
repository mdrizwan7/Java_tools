package com.thinking.machines.util;
public class TMLinkedList<T> implements TMList<T>
{
class TMNode<T>
{
public T data;
public TMNode<T> next;
public TMNode()
{
this.data=null;
this.next=null;
}
}
public class TMLinkedListIterator<T> implements TMIterator<T>
{
private TMNode<T> ptr;
public TMLinkedListIterator(TMNode<T> ptr)
{
this.ptr=ptr;
}
public boolean hasNext()
{
return this.ptr!=null;
}
public T next()
{
if(this.ptr==null) throw new InvalidIteratorException("Iterator has no more elements");
T data=this.ptr.data;
this.ptr=this.ptr.next;
return data;
}
}
public TMIterator<T> iterator()
{
TMIterator<T> iterator=new TMLinkedListIterator<T>(this.start);
return iterator;
}
private TMNode<T> start;
private TMNode<T> end;
private int size;
public TMLinkedList()
{
this.start=null;
this.end=null;
this.size=0;
}
public void add(T data)
{
TMNode<T> node=new TMNode<T>();
node.data=data;
if(this.start==null)
{
this.start=node;
this.end=node;
}
else
{
this.end.next=node;
this.end=node;
}
this.size++;
}
public void add(int index,T data)
{
if(index<0) throw new IndexOutOfBoundsException("Invalid Index : "+index);
if(index>=this.size)
{
this.add(data);
return;
}
TMNode<T> node=new TMNode<T>();
node.data=data;
if(index==0)
{
node.next=this.start;
this.start=node;
}
else
{
int x;
x=0;
TMNode<T> t,r;
t=this.start;
r=null;
while(x<index)
{
r=t;
t=t.next;
x++;
}
r.next=node;
node.next=t;
}
this.size++;
}
public void insert(int index,T data)
{
this.add(index,data);
}
public T removeAt(int index)
{
if(index<0 || index>=this.size) throw new IndexOutOfBoundsException("Invalid Index : "+index);
T data;
if(this.start==this.end)	// Only One Element
{
data=this.start.data;
this.start=null;
this.end=null;
this.size=0;
return data;
}
if(index==0)	// Many But Top Element
{
data=this.start.data;
this.start=this.start.next;
this.size--;
return data;
}
TMNode<T> t,r;
t=this.start;
r=null;
for(int x=0;x<index;x++)
{
r=t;
t=t.next;
}
data=t.data;
r.next=t.next;
this.size--;
return data;
}
public void clear()
{
this.size=0;
this.start=null;
this.end=null;
}
public void removeAll()
{
this.clear();
}
public T get(int index)
{
if(index<0 || index>=this.size) throw new IndexOutOfBoundsException("Invalid Index : "+index);
TMNode<T> node;
node=this.start;
for(int x=0;x<index;x++) node=node.next;
return node.data;
}
public int size()
{
return this.size;
}
public void update(int index,T data)
{
if(index<0 || index>=this.size) throw new IndexOutOfBoundsException("Invalid Index : "+index);
TMNode<T> node;
node=this.start;
for(int i=0;i<index;i++) node=node.next;
node.data=data;
}
public void copyTo(TMList<T> other)
{
other.clear();
for(int e=0;e<this.size();e++) other.add(this.get(e));
}
public void copyFrom(TMList<T> other)
{
this.clear();
for(int e=0;e<other.size();e++) this.add(other.get(e));
}
public void appendTo(TMList<T> other)
{
for(int e=0;e<this.size();e++) other.add(this.get(e));
}
public void appendFrom(TMList<T> other)
{
for(int e=0;e<other.size();e++) this.add(other.get(e));
}
public void forEach(TMListItemAcceptor<T> a)
{
if(a==null) return;
for(TMNode<T> node=this.start;node!=null;node=node.next) a.accept(node.data);
}
}