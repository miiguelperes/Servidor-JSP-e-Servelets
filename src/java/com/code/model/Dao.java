package com.code.model;

import java.sql.SQLException;
import java.util.List;

public interface Dao<T> {
    public boolean insert(T value) throws SQLException;
    public boolean delete(T value) throws SQLException;
    public boolean update(T value) throws SQLException;
    public T select(T value) throws SQLException;
    public List<T> selectAll() throws SQLException;
}