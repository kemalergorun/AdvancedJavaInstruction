package enumTypes;

public class Runner {
    public static void main(String[] args) {

    }
    public static void printpS(String strength){
        if (strength.equals(PassStrenCons.TOOWEAK)){
            System.out.println("pass to weak");

        } else if (strength.equals(PassStrenCons.WEAK)) {
            System.out.println("pass weak");

        } else if (strength.equals(PassStrenCons.STRONG))
        {
            System.out.println("pass strong");

        } else if (strength.equals(PassStrenCons.VERYSTRONG)) {
            System.out.println("pass verys");

        }
    }
    public static void printPSE(PassStr strength){
        if (strength.equals(PassStr.TOO_WEAK)){
            System.out.println("tooweak");
            System.out.println(strength.getLevel());
        }
    }
}
