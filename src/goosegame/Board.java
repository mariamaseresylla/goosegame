package goosegame;
//class Board 
public abstract class Board {
    protected final int nbOfCells ;
    protected Cell [] theCells;
    //build board 
    public Board( int nbOfCells){
        this.nbOfCells = nbOfCells;
        this.theCells= new Cell[nbOfCells];
        this.initBoard();
          
        }
    /**
     * returns the cell at the position of index.
     * @param index
     * @return
     */
    public Cell getCell(int index){
        return this.theCells[index];

    }

    //ajouter un getnbofCeells
    public int getNbOfCells(){
        return this.nbOfCells;
    }
    protected void initBoard(){
        
    }
}
