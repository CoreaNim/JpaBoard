package com.and;

import com.and.domain.Board;
import com.and.domain.User;
import com.and.repo.BoardRepository;
import com.and.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
* Created by Administrator on 2015-03-16.
*/
@SpringBootApplication
public class Application implements CommandLineRunner{

    @Autowired
    UserRepository userRepository;
    @Autowired
    BoardRepository boardRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("start");
    }

    @Bean
    public InternalResourceViewResolver setupViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new User(1L,"김우승"));
        userRepository.save(new User(2L, "김록영"));

        System.out.println("----------------------------");
        for ( User user : userRepository.findAll() ){
            System.out.println(user);
        }

        boardRepository.save(new Board(1L,"너는누구냐?","나는나다"));
        boardRepository.save(new Board(2L,"너는누구냐?","나는나다"));
        boardRepository.save(new Board(3L,"너는누구냐?","나는나다"));

        for ( Board board : boardRepository.findAll() ){
            System.out.println(board);
        }

    }
}
