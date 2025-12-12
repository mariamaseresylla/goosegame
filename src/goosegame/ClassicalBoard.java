package goosegame;
import goosegame.cell.*;
// class classicalboard
   public class ClassicalBoard extends Board {
    // build classicalboard
    public ClassicalBoard(int nbOfCells) {
        super(nbOfCells);
    }
    /**
     * return true if this cell is goose
     * @param i
     * @return
     */
    private boolean isGooseCell(int i) {
        return i == 9 || i == 18 || i == 27 || i == 36 || i == 45 || i == 54;

    }
    /**
     * return true if the cell is trap
     * @param i
     * @return
     */
    private boolean isTrapCell(int i) {
        return i == 31 || i == 52;
    }

    /**
     * return true if the  
     * @param i
     * @return
     */
    private boolean isWaitingCell(int i) {
        return i == 19;
    }
    /**
     * 
     * @param i
     * @return
     */
    private boolean isTeleportCell(int i) {
        return i == 6 || i == 42 || i == 58;

    }

    /**
     * return the next destination of i
     * @param i
     * @return
     */
    private int nextDestination(int i){
        if (i==6){
            return 12;
        }
        else if (i==42){
            return 30;
        }
        else if (i== 58){
            return 1;
        }
        else{
            return i;
        }

    }
    /**
     * init each cell of the board by one type cell
     */
    protected void initBoard() {
        for (int i = 0; i < this.theCells.length; i++) {
            if (this.isGooseCell(i)) {
                this.theCells[i] = new CellGoose(i);
            } else if (this.isTrapCell(i)) {
                this.theCells[i] = new CellTrap(i);
            } else if (this.isTeleportCell(i)) {
                this.theCells[i] = new CellTeleport(i,nextDestination(i));
            } else if (this.isWaitingCell(i)) {
                this.theCells[i] = new CellWating(i,2);
            } else {
                this.theCells[i] = new NormalCell(i);
            }
        }

    }

}
