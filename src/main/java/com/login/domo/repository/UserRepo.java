package com.login.domo.repository;

import com.login.domo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface UserRepo extends JpaRepository<User, Integer> {
    @Override
    List<User> findAll();

    @Override
    <S extends User> S saveAndFlush(S s);

    @Override
    User getOne(Integer integer);

    User findByIdAndPassword(int id, String password);
}
