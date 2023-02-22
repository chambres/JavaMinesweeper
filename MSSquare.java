public class MSSquare{
    public static final int SHOWN = 0;
    public static final int UP = 1;
    public static final int FLAG = 2;
    public static final int QUESTION = 3;
    public boolean mine;

    int number;
    int state;

    boolean empty;

    MSSquare(){
        mine = false;
        number = 0;
        state = UP;
    }

    boolean getMine(){
        return mine;
    }

    int getNumber(){
        return number;
    }

    int getState(){
        return state;
    }

    void setMine(boolean mine){
        this.mine = mine;
    }

    void setState(int state){
        this.state = state;
    }

    void setNumber(int number){
        this.number = number;
    }

    
    @Override
    public String toString(){
        if(mine){
            return "M";
        }
        if(number == 0) {
            return "-";
        }
        if(number > 0 && number < 9){
            return "" + number;
        }
        return "";
    }


}