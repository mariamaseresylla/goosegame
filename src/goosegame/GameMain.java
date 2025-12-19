package goosegame;

public class GameMain{
    public static void main(String[] args) {
        Board b=new ClassicalBoard();
        Game g=new Game(b);
        Player p1=new Player("alpha");
        Player p2=new Player("pathe");
        g.addPlay(p2);
        g.addPlay(p1);
        g.play();



    }
}