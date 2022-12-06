package services;

import common.exception.ExistException;
import common.exception.NotFoundInDatabase;

import java.io.IOException;
import java.util.List;

public interface IService<O> {

    List<O> getList();

    void add(O object) throws ExistException, IOException;

    void edit(O object);

    void delete(O object) throws NotFoundInDatabase;
}
