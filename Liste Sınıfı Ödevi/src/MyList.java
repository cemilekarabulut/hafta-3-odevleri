import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MyList<T> {
    private T[] list;
    private int capacity;

    public MyList() {
        this.capacity = 10;
        this.list = (T[]) new Object[10];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.list = (T[]) new Object[capacity];
    }

    public int size() {
        int size = 0;
        for (T t : this.list) {
            if (t != null) size++;
        }
        return size;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void add(T data) {
        if (this.capacity <= size()) {
            this.capacity *= 2;
        }
        T[] newList = (T[]) new Object[capacity];
        int i = 0;
        for (i = 0; i < size(); i++) {
            newList[i] = this.list[i];
        }
        newList[i] = data;
        this.list = newList.clone();
    }

    public T get(int index) {
        if (index >= this.capacity && this.list[index] == null) {
            return null;
        }
        return this.list[index];
    }

    public void remove(int index) {
        if (index < this.capacity && this.list[index] != null) {
            T[] newList = (T[]) new Object[capacity];
            for (int i = 0; i < this.capacity; i++) {
                if (i != index) {
                    newList[i] = this.list[i];
                }
            }
            this.list = newList;
        }
    }

    public void set(int index, T data) {
        if (index < this.capacity && this.list[index] != null) {
            this.list[index] = data;
        }
    }

    public int indexOf(T data) {
        for (int i = 0; i < this.capacity; i++) {
            if (this.list[i] == data)
                return i;
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = this.capacity - 1; i >= 0; i--) {
            if (this.list[i] == data)
                return i;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.capacity < 1 || this.list[0] == null;
    }

    public void clear() {
        for (int i = 0; i < this.capacity; i++) {
            if (this.list[i] != null)
                this.remove(i);
        }
    }

    public T[] toArray() {
        ArrayList<T> temp = new ArrayList<>();
        for (int i = 0; i < this.capacity; i++) {
            if (this.list[i] != null)
                temp.add(this.list[i]);
        }
        return (T[]) temp.toArray();
    }

    public MyList<T> sublist(int start, int finish) {
        MyList<T> newList = new MyList<>();
        ArrayList<T> temp = new ArrayList<>();
        for (int i = 0; i < this.capacity; i++) {
            if (i >= start && i <= finish)
                temp.add(this.list[i]);
        }
        for (T t : temp) {
            newList.add(t);
        }
        return newList;
    }

    public boolean contains(T data) {
        for (T t : this.list) {
            if (t != null && t.equals(data))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.stream(list).filter(Objects::nonNull).toArray());
    }
}
