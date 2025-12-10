package goosegame.cell;

import goosegame.Cell;

public class CellWating   extends Cell{
    private int waitingTime;
    public CellWating(int numCell,int waitingTime){
        super(numCell);
        this.waitingTime=waitingTime;

    }
    public int getWaitingTime() {
        return waitingTime;
    }
    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }
    public boolean canLeave(){
        if(this.waitingTime==0){
            return true;
        }
        else{
            this.waitingTime=this.waitingTime-1;
            return false;
        }

    }

    
}