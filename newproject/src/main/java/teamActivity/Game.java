package teamActivity;

import com.google.gson.Gson;

public class Game {
    Player _player;

    public Game(Player player){
        _player = player;

    }
    public void saveGame(String name) {
        Gson gson = new Gson();
        String json = gson.toJson(name);
        System.out.println(json);
    }
    static Game loadGame(String name){
        Gson gson = new Gson();
        Player player = gson.fromJson(name, Player.class);
        Game game = new Game(player);

        return game;
    }


}
