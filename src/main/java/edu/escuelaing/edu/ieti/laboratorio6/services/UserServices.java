package edu.escuelaing.edu.ieti.laboratorio6.services;

import edu.escuelaing.edu.ieti.laboratorio6.model.*;

import java.util.List;

public interface UserServices {
    List<User> getAll();

    User getById(String userId);

    User create(User user);

    User update(User user);

    void remove(String userId);
}