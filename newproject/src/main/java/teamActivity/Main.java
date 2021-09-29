package teamActivity;

import com.google.gson.Gson;

public class Main {
    static final String THE_FILE = "";

    public static void main(String[] args) {
        Player player = new Player("This name", 1 ,2 ,3);
        Game game = new Game(player);
        game.saveGame("test-2");
        player.Display();
//        Game newGame = Game.loadGame('file-3');
        System.out.println(game);
    }
}