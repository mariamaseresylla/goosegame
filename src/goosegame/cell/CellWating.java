package goosegame.cell;

import goosegame.Cell;
import goosegame.Player;

public class CellWating   extends Cell{
    private int waitingTime;
    private final int WAITING_TIME;

    public CellWating(int numCell,int waitingTime){
        super(numCell);
        this.WAITING_TIME = waitingTime;
        this.waitingTime = waitingTime;

    }
    public int getWaitingTime() {
        return waitingTime;
    }
    
    public void setPlayer(Player player) {
        super.setPlayer(player);
        this.waitingTime = this.WAITING_TIME;
    }
    
    public boolean canLeave(){            
        this.waitingTime=this.waitingTime-1;
        return waitingTime == 0;

    }

    
}