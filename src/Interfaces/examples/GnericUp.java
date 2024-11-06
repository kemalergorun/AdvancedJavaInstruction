package Interfaces.examples;

public class GnericUp <T extends Number>{
    public T[]numberArray;
    public Double getAvarage(){
        double sum=0;
        for (T number:this.numberArray){
            sum+=number.doubleValue();

        }double avg=sum/this.numberArray.length;
        return avg;
    }

    public static void main(String[] args) {
        Integer[]integers={5,30,2,6,90};
        Double[]doubles={0.5,87.2,10.9,3.8};
        String[]strings={"gen","can","be"};
        GnericUp<Integer>object1=new GnericUp<>();
        object1.numberArray=integers;
        System.out.println(object1.getAvarage());

        GnericUp<Double>object2=new GnericUp<>();
        object2.numberArray=doubles;
        System.out.println(object2.getAvarage());



    }

}
