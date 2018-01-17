public enum Value{
    TWO('2'), THREE('3'), FOUR('4'), FIVE('5'), SIX('6'), SEVEN('7'), EIGHT('8'), NINE('9'), TEN('T'), JACK('J'), QUEEN('Q'), KING('K'), ACE('A');

    private char c;

    Value(char c){
        this.c = c;
    }

    public String toString(){
        return "" + this.c;
    }
}
