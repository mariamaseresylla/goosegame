package goosegame.cell;
import goosegame.*;
public class CellTeleport extends Cell {
    private Cell nextCell;
    public CellTeleport(int numCell,Cell nextCell){
        super(numCell);
        this.nextCell=nextCell;
    }
    
    public int bound(int dee){
        return  this.nextCell.getNumCell() - this.numCell ;

    }
}
