package com.example.CFLICKS.repositories;

import com.example.CFLICKS.models.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {

    public abstract ArrayList<UserModel> findByCode(String code);

    public abstract String deleteByCode(String code);
}
