package com.ho.test.service.main;

import com.ho.test.entity.main.Board;
import com.ho.test.repository.main.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class BoardService {
    @Autowired
    BoardRepository boardRepository;

//    @Transactional
//    public void plusClick(Integer integer){
//        Board board = boardRepository.findByNo(integer);
////        board.updateClicks();
//        board.setViews(board.getViews()+1);
//        boardRepository.save(board);
//    }

    public void plusClick(Integer integer) {
        Optional<Board> board = boardRepository.findById(integer);
        board.ifPresent(e -> {
            e.setViews(e.getViews() + 1);
        });
        boardRepository.save(board.get());
    }

    public void deleteBoard(Integer integer){
        Optional<Board> board = boardRepository.findById(integer);
//        board.ifPresent(e->{
//            boardRepository.delete(board.get());
//        });
        if(board.isPresent()){
            boardRepository.delete(board.get());
        }
    }
}
