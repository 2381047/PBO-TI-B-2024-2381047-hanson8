package repositories;

import entities.TodoList;

import javax.xml.crypto.Data;
import java.sql.Connection;

public class TodiListRepositoryDblmpl implements TodoListRepository {
    private final Database database;

    public TodoListRepositoryDblmpl(final Database database) {
        this.database = database;
    }
    @Override
    public TodoList[] getAll() {
        Connection connection = database.getConnection();
        String sqlStatement = "SELECT * FROM todos";
        List<TodoList> todoList
        }

    @Override
    public void add(final TodoList todoList) {

    }

    @Override
    public Boolean remove(final Integer id) {
        return null;
    }

    @Override
    public Boolean edit(final TodoList todoList) {
        return null;
    }

}
