package com.and.service;

import com.and.domain.Board;

import java.util.List;

/**
 * Created by Administrator on 2015-03-17.
 */
public interface BoardService {
    List<Board> search();
    void add(Board board);
}

