package com.and.repo;

import com.and.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Administrator on 2015-03-16.
 */
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByName(String name);
}
