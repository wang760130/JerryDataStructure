package com.jerry.list;

/**
 * 链表接口
 * @author Jerry Wang
 *
 * @param <T>
 */
public interface List<T>  {
  
    int size();

    boolean isEmpty();

    boolean contains(T e);

//    Iterator<E> iterator();

    Object[] toArray();
   
    T[] toArray(T[] e);

    boolean add(T e);
    
    boolean remove(T e);
    
    boolean containsAll(List<T> list);

    boolean addAll(List<T> list);
  
    boolean addAll(int index, List<T> list);

    boolean removeAll(List<T> list);

    boolean retainAll(List<T> list);

    void clear();

    boolean equals(Object o);

    int hashCode();

    T get(int index);

    T set(int index, T e);

    void add(int index, T e);

    T remove(int index);

    int indexOf(T e);

    int lastIndexOf(T e);


//    ListIterator<T> listIterator();

//    ListIterator<T> listIterator(int index);

    List<T> subList(int fromIndex, int toIndex);

    void display();
    
    void reverse();
}