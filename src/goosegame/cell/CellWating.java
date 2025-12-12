package goosegame.cell;

import goosegame.Cell;
import goosegame.Player;
//class  cellwaiting 
public class CellWating   extends Cell{
    private int waitingTime;
    private final int WAITING_TIME;
    // class cellwating
    public CellWating(int numCell,int waitingTime){
        super(numCell);
        this.WAITING_TIME = waitingTime;
        this.waitingTime = waitingTime;

    }
    /**
     * get waiting time 
     * @return
     */
    public int getWaitingTime() {
        return waitingTime;
    }
    /**
     * echange  la place des  joueurs en actualisant le temps d'attente  
     * @param player
     */
    public void setPlayer(Player player) {
        super.setPlayer(player);
        this.waitingTime = this.WAITING_TIME;
    }
    /**
     * verifie si le joueur peut quitter et diminu son temps d'arret 
     * @return 
     */
    public boolean canLeave(){            
        this.waitingTime=this.waitingTime-1;
        return waitingTime == 0;

    }

    
}