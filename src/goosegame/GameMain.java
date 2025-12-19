package goosegame;

public class GameMain{
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java -jar goosegame.jar <joueur1> <joueur2> ...");
            return;
        }
        Board b = new ClassicalBoard();
        Game g = new Game(b);
        for (String name : args) {
            g.addPlay(new Player(name));
        }
        g.play();
    }
}