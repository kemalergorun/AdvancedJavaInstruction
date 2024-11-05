package generics;

public class GenClaTwoParam<S,U>
{private S myKey;
    private U myValue;

    public GenClaTwoParam(S myKey, U myValue) {
        this.myKey = myKey;
        this.myValue = myValue;
    }

    public S getMyKey() {
        return myKey;
    }

    public void setMyKey(S myKey) {
        this.myKey = myKey;
    }

    public U getMyValue() {
        return myValue;
    }

    public void setMyValue(U myValue) {
        this.myValue = myValue;
    }
}
