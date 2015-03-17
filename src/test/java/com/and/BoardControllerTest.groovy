package com.and
import com.and.domain.Board
import com.and.repo.BoardRepository
import com.and.service.BoardService
import com.and.service.BoardServiceImpl
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.web.WebAppConfiguration
import spock.lang.Specification
/**
 * Created by Administrator on 2015-03-17.
 */
@ContextConfiguration(loader = SpringApplicationContextLoader.class, classes = [Application.class])
@WebAppConfiguration
class BoardControllerTest extends Specification{

    BoardService boardService = new BoardServiceImpl();
    BoardRepository boardRepository = Mock(BoardRepository.class);

    def setup(){
        boardService.boardRepository = boardRepository;
    }

    def "게시판 등록 테스트"(){
        given:
        def board = new Board(1L, "너는누구?","나는나다.");

        when:
        boardService.add(board);

        then:
        1 * boardRepository.save({it.id == 1L});
    }

}
