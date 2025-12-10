package goosegame.cell;
import goosegame.*;
/*class CellTeleport */
public class CellTeleport extends Cell {
    private int nextNum;
    public CellTeleport(int numCell, int nextNum){
        super(numCell);
        this.nextNum= nextNum;
    }
    /**
     * calcul the rebond of the cell
     * @param dee
     * @return
     */
    public int bound(int dee){
       return  this.nextNum- this.numCell;
       
    }
}
