package com.and.repo;

import com.and.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2015-03-16.
 */
public interface BoardRepository extends JpaRepository<Board, Long> {

}
