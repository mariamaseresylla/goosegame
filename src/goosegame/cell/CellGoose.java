package goosegame.cell;
import goosegame.*;
public class CellGoose extends Cell {
    public CellGoose(int numCell){
        super(numCell);
    }
    
    public int bound(int dee){
        return dee; //a modifier c est pas 2*dee c seulement dee relis le sujet
    }
    
}
