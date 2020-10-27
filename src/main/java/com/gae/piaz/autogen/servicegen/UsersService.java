package com.gae.piaz.autogen.servicegen;

import com.gae.piaz.autogen.model.Users;
import com.gae.piaz.autogen.repositorygen.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
* Generated by Springboot-3layer-Generator at 27 ott 2020, 18:23:45
*/
@Service
public class UsersService implements CrudService<Users,java.lang.Integer> {

    @Autowired
    private UsersRepository repository;

    @Override
    public Users create(Users entity) {
        return repository.save(entity);
    }

    @Override
    public Users update(Users entity) {
        return repository.save(entity);
    }

    @Override
    public Page<Users> read(Users entity, Pageable pageable) {
        Example<Users> example = Example.of(entity);
        return repository.findAll(example,pageable);
    }

    @Override
    public Users readOne(java.lang.Integer primaryKey) {
        return repository.getOne(primaryKey);
    }

    @Override
    public void delete(java.lang.Integer primaryKey) {
        repository.deleteById(primaryKey);
    }
}