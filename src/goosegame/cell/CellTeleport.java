package goosegame.cell;
import goosegame.*;
public class CellTeleport extends Cell {
    private int nextNum;
    public CellTeleport(int numCell,int nextNum){
        super(numCell);
        this.nextNum=nextNum;
    }
    
    public int bound(int dee){
        return  this.nextNum - this.numCell ;

    }
}
