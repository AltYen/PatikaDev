package Generic.PrivateList;

import OOP.AdventureGame.Player;

public class MyList <T> {

    private int capacity = 10;
    private T[] array;

    public MyList() {
        this.array = (T[]) new Object[this.capacity];
    }

    public MyList(int capacity){
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
    }

    public int size(){
        int count=0;
        for(T i:array){
            if(i!=null){
                count++;
            }
        }
        return count;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public void add(T data){
        int index = this.size();
        if(index == this.capacity){
            this.setCapacity(this.capacity*2);
            T[] newArray = (T[]) new Object[this.capacity];
            for(int i = 0;i<this.array.length;i++){
                newArray[i] = this.array[i];
            }
            this.setArray(newArray);
        }
        array[index]=data;
    }

    public T get(int index){
        if(index < 0 || index > this.array.length){
            return null;
        }
        return this.array[index];
    }

    public T remove(int index){
        if(index < 0 || index > this.array.length){
            return null;
        }
        this.array[index] = null;
        for(int i=index;i<this.array.length-1;i++){ // seçilen indisten itibaren sola kaydırma işlemini yapan döngü.
            this.array[i]=this.array[i+1];
        }
        return this.array[index];
    }

    public T set(int index, T data){
        if(index < 0 || index > this.array.length){
            return null;
        }
        this.array[index] = data;
        return this.array[index];
    }

    public String toString(){
        if(this.size() > 0){
            String str = "[";
            for(int i = 0; i < this.array.length; i++){
                if(this.array[i] != null){
                    str+= this.array[i] + ", ";
                }
            }
            str=str.substring(0,str.length()-2) + "]";
            return str;
        }
        return "[]";

    }

    public int indexOf(T data){
        for(int i = 0;i<this.array.length;i++){
            if(this.array[i] == data){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data){
        int lastIndex = -1;
        for(int i = 0;i<this.array.length;i++){
            if(this.array[i] == data){
                lastIndex=i;
            }
        }
        return lastIndex;
    }

    public boolean isEmpty(){
        boolean isEmpty=true;
        for(T i:this.array){
            if(i != null){
                isEmpty=false;
            }
        }
        return isEmpty;
    }

    public T[] toArray(){
        return this.array;
    }

    public void clear(){
        for(int i = 0;i<this.array.length;i++){
            if(this.array[i] != null)
                this.array[i] = null;
        }
    }

    public MyList<T> subList(int start,int finish){
        MyList<T> sublist = new MyList<>(finish-start);
        for(int i = start;i<=finish;i++){
            sublist.add(this.array[i]);
        }
        return sublist;
    }

    public boolean contains(T data){
        boolean isContain = false;
        for(T i:this.array){
            if(i == data){
                isContain=true;
                break;
            }
        }
        return isContain;
    }

}
