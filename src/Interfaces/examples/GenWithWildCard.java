package Interfaces.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.util.Arrays.stream;

public class GenWithWildCard {
    public static void main(String[] args) {
        List<Integer>integers=new ArrayList<>();
        List<Double>doubles=new ArrayList<>();
        List<String>strings=new ArrayList<>();
        List<Number>numbers=new ArrayList<>();
        List<Object>objects=new ArrayList<>();
        addElems(integers);
        System.out.print(integers);
        addElems(numbers);
        addElems(objects);



    }
    public static void addElems(List<?super Integer>list){
        for (int i=1;i<11;i++){
            list.add(i);

        }


    }public static List<?> mult2(List<?extends Number>list){
        List<Double>newlist=list.stream().map(element->2*element.doubleValue()).toList();
        return list;


    }
    public static void printelem(List<?>list){
        for (Object obj:list){
            System.out.println(obj + " ");
        }

    }public static<T> void addElemt(List<T>list,T element){
        list.add(element);
    }

}
