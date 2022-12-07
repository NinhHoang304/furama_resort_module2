package services;

import common.exception.ExistException;
import common.exception.NotFoundException;
import common.exception.NotFoundInDatabase;

import java.io.IOException;
import java.util.List;

public interface IService<O> {

    List<O> getList() throws IOException;

    void add(O object) throws ExistException, IOException;

    void edit(O object) throws IOException, ExistException;

    void delete(O object) throws NotFoundInDatabase, IOException, NotFoundException;

    boolean checkId (String id) throws IOException;
}
