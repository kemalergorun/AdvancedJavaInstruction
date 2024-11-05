package generics;

import java.util.ArrayList;
import java.util.HashMap;

public class RunnerGeneric {
    public static void main(String[] args) {
        GenericProduct<String> book=new GenericProduct();
        book.setCode("advJava");
        GenericProduct<Integer>laptop=new GenericProduct();
        laptop.setCode(123456);
        String string= book.getCode();
        Integer integer= laptop.getCode();
        System.out.println(string);
        System.out.println(integer);
        //ArrayList<String>list=new ArrayList<>();
        HashMap<String,Double>hashMap=new HashMap<>();
        hashMap.put("AdvJava",99.9);
        GenClaTwoParam<String,String>myMap=new GenClaTwoParam<>("generic","awesome");


    }
}
