package goosegame.cell;
import goosegame.*;
public class CellGoose extends Cell {
    public CellGoose(int numCell){
        super(numCell);
    }
    
    public int bound(int dee){
        return 2*dee;
    }
    
}
