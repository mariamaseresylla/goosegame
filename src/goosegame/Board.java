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

    //ajouter un getnbofCeells
    public int getNbOfCells(){
        return this.nbOfCells;
    }
    protected void initBoard(){
        for (int i=0; i<this.theCells.length;i++){
            if ( this.theCells[i]== ){

            }
           

        }
    }
}
