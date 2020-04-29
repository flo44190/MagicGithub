package com.openclassrooms.magicgithub.repository;
import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;
import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.generateUsers;

import java.util.List;

public class UserRepository {

    private final ApiService apiService;

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }


    public List<User> getUsers() {
    return apiService.getUsers();
    }

    public void generateRandomUser() {
        apiService.generateRandomUser();

    }

    public void deleteUser(User user) {
        apiService.deleteUser(user);
    }
}
