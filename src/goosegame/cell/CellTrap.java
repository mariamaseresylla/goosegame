package goosegame.cell;
import goosegame.*;
public class CellTrap  extends Cell{
    int numCell;
 public CellTrap(int numCell){
    super(numCell);
    this.numCell=numCell;
 }
 public boolean canLeave(){
    return false;
 }
}