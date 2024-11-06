package enumTypes;

public enum PassStr {
    TOO_WEAK(5),
    WEAK(25),
    STRONG(50),
    VERY_STRONG(80);
    private final int level;
    private PassStr(int level){
        this.level=level;

    }

    public int getLevel() {
        return level;
    }
}
