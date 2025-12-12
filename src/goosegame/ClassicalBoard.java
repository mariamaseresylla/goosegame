    package goosegame;

    import goosegame.cell.CellGoose;
    import goosegame.cell.CellTeleport;
    import goosegame.cell.CellTrap;

    public class ClassicalBoard extends Board {
        public ClassicalBoard(int nbOfCells){
            super(nbOfCells);
        }

    private boolean isGooseCell(){
        
    }
    private boolezn 


    protected void initBoard(){
        for ( int i=0; i< this.theCells.length;i++){
            if (i==9){
                this.theCells[i]= new CellGoose(i);
            }
            if (i==18){
                this.theCells[i]= new CellGoose(i);
            }
            if (i==27){
                this.theCells[i]= new CellGoose(i);
            }
            if (i==36){
                this.theCells[i]= new CellGoose(i);
            }if (i==45){
                this.theCells[i]= new CellGoose(i);
            }
            if (i==54){
                this.theCells[i]= new CellGoose(i);
            }
            if (i==31){
                this.theCells[i]= new CellTrap(i);
            }
             if (i==52){
                this.theCells[i]= new CellTrap(i);
            }
             if (i==6){
                this.theCells[i]= new CellTeleport(i,i+1);
            }

             if (i==42){
                this.theCells[i]= new CellTeleport(i,i+1);
            }
             if (i==58){
                this.theCells[i]= new CellTeleport(i,i+1);
            }
            else {

            }

        }
    }
     
}
