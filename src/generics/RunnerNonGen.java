package generics;

public class RunnerNonGen {
    public static void main(String[] args) {
        NonGenericProduct book=new NonGenericProduct();
        book.setCode("advJava");
        NonGenericProduct laptop=new NonGenericProduct();
        laptop.setCode("123456");
        String string=(String) book.getCode();
        String string1=(String) laptop.getCode();
        System.out.println(string1);
        System.out.println(string);

    }
}
