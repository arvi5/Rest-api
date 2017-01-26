package RESTAPI.Restmodule.Service;

import java.util.List;

import RESTAPI.Restmodule.Entities.User;

public interface UserService {

	public List<User> findAllUsers();

	public User findById(long id);

	public User createUser(User user);

	public User updateUser(long id, User user);

	public void deleteUserById(long id);

	public void deleteAllUsers();

}
