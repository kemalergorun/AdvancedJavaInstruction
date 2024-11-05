package generics.methods;

import java.util.Arrays;

public class GenericMethod {






    public static void printArray(Integer[]array){
        Arrays.stream(array).forEach(t-> System.out.println(t+""));
        System.out.println();

    }
    public static <T>void printArrayGeneric(T[]array){
        Arrays.stream(array).forEach(t-> System.out.println(t+""));
        System.out.println();

    }
    public static <T> T getfirst(T[]array){
        T first=array[0];
        return first;
    }
    public static <T,U> void printArrayAndElement(T[]array,U element){
        Arrays.stream(array).forEach(t-> System.out.println(t+""));
        System.out.println();
        System.out.println(element);
    }


    public static void main(String[] args) {
        String[]strings={"a,","b"};
        Integer[]integers={1,2,3,4};
        printArrayGeneric(strings);
        printArrayGeneric(integers);
        System.out.println(getfirst(strings));
        System.out.println(getfirst(integers));
        printArrayAndElement(strings,getfirst(integers));

    }
}
