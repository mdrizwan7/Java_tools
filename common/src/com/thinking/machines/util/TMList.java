package com.thinking.machines.util;
public interface TMList<T>
{
public void add(T data);
public void add(int index,T data);
public void insert(int index,T data);
public T removeAt(int index);
public void removeAll();
public void clear();
public T get(int index);
public int size();
public void update(int index,T data);
public void copyTo(TMList<T> other);
public void copyFrom(TMList<T> other);
public void appendTo(TMList<T> other);
public void appendFrom(TMList<T> other);
public TMIterator<T> iterator();
public void forEach(TMListItemAcceptor<T> a);
}

