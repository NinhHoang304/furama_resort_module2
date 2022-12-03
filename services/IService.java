package services;

import common.exception.ExistException;
import common.exception.NotFoundInDatabase;

import java.util.List;

public interface IService<Object> {

    List<Object> display();

    void add(Object object) throws ExistException;

    void edit(Object object);

    void delete(Object object) throws NotFoundInDatabase;
}
