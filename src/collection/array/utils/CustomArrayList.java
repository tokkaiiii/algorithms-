package collection.array.utils;

import java.util.Arrays;

public class CustomArrayList<E> {

  private static final int DEFAULT_CAPACITY = 10;
  private Object[] elementData;
  private int size;

  public CustomArrayList() {
    this.elementData = new Object[DEFAULT_CAPACITY];
  }

  public CustomArrayList(int initialCapacity) {
    elementData = new Object[initialCapacity];
  }

  public int size() {
    return size;
  }

  public void add(E element) {
    if (size == elementData.length) {
      resize();
    }
    elementData[size++] = element;
  }

  public void add(int index, Object element) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
    if (size == elementData.length) {
      resize();
    }
    System.arraycopy(elementData, index, elementData, index + 1, size - index);
    elementData[index] = element;
    size++;
  }

  public void remove(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
    System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
    elementData[--size] = null; // Clear the last element
  }

  @SuppressWarnings("unchecked")
  public E get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
    return (E) elementData[index];
  }

  public void set(int index, E element) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
    elementData[index] = element;
  }

  public int indexOf(E element) {
    for (int i = 0; i < size; i++) {
      if (element.equals(elementData[i])) {
        return i;
      }
    }
    return -1; // Not found
  }

  private void resize() {
    int newCapacity = elementData.length * 2;
    Object[] newElementData = new Object[newCapacity];
    System.arraycopy(elementData, 0, newElementData, 0, size);
    elementData = newElementData;
  }

  @Override
  public String toString() {
    return Arrays.toString(Arrays.copyOf(elementData, size)) + " size=" +
        size + ", capacity=" + elementData.length;
  }
}
