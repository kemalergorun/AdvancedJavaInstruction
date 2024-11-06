package Interfaces;

public class GenericInt<T>implements GenInt1<T>{
    @Override
    public void print(T value) {
    }

    @Override
    public T find() {
        return null;
    }
    //if you implement interface the class must generic
}
