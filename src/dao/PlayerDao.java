package dao;

import util.FileUtil;

public class PlayerDao {

    public void savePlayer(String data) {
        FileUtil.write("players.txt", data);
    }
}