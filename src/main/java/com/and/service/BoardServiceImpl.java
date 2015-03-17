package com.and.service;

import com.and.domain.Board;
import com.and.repo.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2015-03-17.
 */
@Service
public class BoardServiceImpl implements BoardService {
    @Autowired
    private BoardRepository boardRepository;

    public List<Board> search(){
        return  boardRepository.findAll();
    };

    public void add(Board board){
        boardRepository.save(board);
    }

}

