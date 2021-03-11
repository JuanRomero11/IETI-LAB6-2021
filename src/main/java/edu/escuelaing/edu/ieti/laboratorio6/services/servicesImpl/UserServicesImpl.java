package edu.escuelaing.edu.ieti.laboratorio6.services.servicesImpl;

import edu.escuelaing.edu.ieti.laboratorio6.services.UserServices;
import edu.escuelaing.edu.ieti.laboratorio6.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserServicesImpl implements UserServices {
    List<User> users = new ArrayList<User>(Arrays.asList(new User("1", "Juancho", "juanromero@gmail.com", "1234"),
            new User("2", "guillermo", "guillermo@gmail.com", "5678"),
            new User("3", "Hachi", "hachi@gmail.com", "1234")));

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public User getById(String userId) {
        User res = null;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(userId)) {
                res = users.get(i);
            }
        }
        return res;
    }

    @Override
    public User create(User user) {
        users.add(user);
        return user;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void remove(String userId) {

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(userId)) {
                users.remove(users.get(i));
            }
        }

    }
}