public enum SuitType {

    HEARTS(3),
    CLUBS(2),
    SPADES(4),
    DIAMONDS(1);

    private final int value;

    SuitType(int value){
        this.value = value;
    }


    public int getValue() {
        return this.value;
    }
}