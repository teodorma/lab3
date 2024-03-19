package pao.blsalin.uniqueListChecker;

import java.util.*;

public class UniqueList<T> implements List<T> {

    private final List<T> storage;

    public UniqueList() {
        storage = new ArrayList<>();
    }

    @Override
    public boolean add(T t) {
        if (storage.contains(t)) {
            return false;
        }
        return storage.add(t);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean modified = false;
        for (T element : c) {
            if (add(element)) {
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public void clear() {
        storage.clear();
    }

    @Override
    public boolean contains(Object o) {
        return storage.contains(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return storage.containsAll(c);
    }

    @Override
    public T get(int index) {
        return storage.get(index);
    }

    @Override
    public int indexOf(Object o) {
        return storage.indexOf(o);
    }

    @Override
    public boolean isEmpty() {
        return storage.isEmpty();
    }

    @Override
    public Iterator<T> iterator() {
        return storage.iterator();
    }

    @Override
    public int lastIndexOf(Object o) {
        return storage.lastIndexOf(o);
    }

    @Override
    public ListIterator<T> listIterator() {
        return storage.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return storage.listIterator(index);
    }

    @Override
    public boolean remove(Object o) {
        return storage.remove(o);
    }

    @Override
    public T remove(int index) {
        return storage.remove(index);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return storage.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return storage.retainAll(c);
    }

    @Override
    public T set(int index, T element) {
        if (!storage.contains(element) || storage.get(index).equals(element)) {
            return storage.set(index, element);
        }
        return null;
    }

    @Override
    public int size() {
        return storage.size();
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return storage.subList(fromIndex, toIndex);
    }

    @Override
    public Object[] toArray() {
        return storage.toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return storage.toArray(a);
    }

    @Override
    public void add(int index, T element) {
        if (!storage.contains(element)) {
            storage.add(index, element);
        }
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        boolean flag = false;
        for (T element : c) {
            if (!storage.contains(element)) {
                storage.add(index++, element);
                flag = true;
            }
        }
        return flag;
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}
