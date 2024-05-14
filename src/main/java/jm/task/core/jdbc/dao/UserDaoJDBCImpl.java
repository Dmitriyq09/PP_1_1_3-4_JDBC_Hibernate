package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// Обработка всех исключений, связанных с работой с базой данных должна находиться в dao
public class UserDaoJDBCImpl implements UserDao {

    public UserDaoJDBCImpl() {

    }

    // Создание таблицы для User(ов) – не должно приводить к исключению, если такая таблица уже существует
    @Override
    public void createUsersTable() {

    }

    // Удаление таблицы User(ов) – не должно приводить к исключению, если таблицы не существует
    @Override
    public void dropUsersTable() {

    }

    // Добавление User в таблицу
    @Override
    public void saveUser(String name, String lastName, byte age) {

    }

    // Удаление User из таблицы ( по id )
    @Override
    public void removeUserById(long id) {

    }

    // Получение всех User(ов) из таблицы
    @Override
    public List<User> getAllUsers() {
        return null;
    }

    // Очистка содержания таблицы
    @Override
    public void cleanUsersTable() {

    }
}