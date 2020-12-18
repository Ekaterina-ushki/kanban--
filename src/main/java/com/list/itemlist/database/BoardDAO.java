package com.list.itemlist.database;

import com.list.itemlist.model.Board;

import java.util.List;

public interface BoardDAO {
    List<Board> findAllBoard();
    void addBoard (Board board);
}
