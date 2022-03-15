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
        for(T t: this.list){
            if(t!=null) size++;
        }
        return size;
    }
    public int getCapacity() {
        return this.capacity;
    }
    public void add(T data) {
        if(this.capacity <= size()){
            this.capacity *= 2;
        }
        T[] newList = (T[]) new Object[capacity];
        int i = 0;
        for(i = 0; i < size(); i++){
            newList[i] = this.list[i];
        }
        newList[i] = data;
        this.list = newList.clone();
    }
}
