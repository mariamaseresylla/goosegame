package goosegame.cell;

import goosegame.*;

public class CellTrap extends Cell {
    public CellTrap(int numCell) {
        super(numCell);

    }

    public boolean canLeave() {
        return false;
    }
}