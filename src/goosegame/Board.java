package goosegame;

public abstract class Board {
    protected final int nbOfCells ;
    protected Cell [] theCells;

    public Board( int nbOfCells){
        this.nbOfCells = nbOfCells;
        this.theCells= new Cell[nbOfCells];
        this.initBoard();
          
        }
    
    public Cell getCell(int index){
        return this.theCells[index];

    }


    protected void initBoard(){
        for (int i=0; i<this.theCells.length;i++){
           
           

        }
    }
}
