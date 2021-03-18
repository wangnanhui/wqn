package com.qiannan.wang;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList<E> implements List<E> {
	public MyList(int campcity) {
		this.campcity = campcity;
		if(elements == null) {
			elements =  new Object[this.campcity];
		}
		
	}
	public MyList() {
		this(defaultCampcity);
		
	}
	
	
	private Object [] elements ; 
	private int size ; 
	private final static int defaultCampcity = 16 ; 
	private int campcity ;
	public int size() {
		
		return size;
	}

	public boolean isEmpty() {
		
		return size == 0 ;
	}

	public boolean contains(Object o) {
		for (int i = 0; i < elements.length; i++) {
			if(elements[i] == o)
				return true ; 
		}
		
		return false;
	}

	public Iterator<E> iterator() {
		
		return null;
	}

	public Object[] toArray() {
		Object [] obj = new Object[size];
		System.arraycopy(elements, 0, obj, 0, size - 1 );
		return obj;
	}

	public <T> T[] toArray(T[] a) {
		
		
		return (T[])toArray();
	}

	public boolean add(E e) {
		
		
		
		
		
		
		return false;
	}

	public boolean remove(Object o) {
		
		
		return false;
	}

	public boolean containsAll(Collection<?> c) {
		
		
		return false;
	}

	public boolean addAll(Collection<? extends E> c) {
		
		
		return false;
	}

	public boolean addAll(int index, Collection<? extends E> c) {
		
		
		
		return false;
	}

	public boolean removeAll(Collection<?> c) {
		
		
		return false;
	}

	public boolean retainAll(Collection<?> c) {
		
		
		return false;
	}

	public void clear() {
		
		
		
	}

	public E get(int index) {
		
		
		
		return null;
	}

	public E set(int index, E element) {
		
		
		
		return null;
	}

	public void add(int index, E element) {
		
		
		
		
	}

	public E remove(int index) {
		
		
		return null;
	}

	public int indexOf(Object o) {
	
		
		
		return 0;
	}

	public int lastIndexOf(Object o) {
		
		
		
		return 0;
	}

	public ListIterator<E> listIterator() {

		
		
		return null;
	}

	public ListIterator<E> listIterator(int index) {
	
		
		
		return null;
	}

	public List<E> subList(int fromIndex, int toIndex) {

		
		
		
		return null;
	}

}
