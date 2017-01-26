package RESTAPI.Restmodule.Repository;

import java.util.List;

import RESTAPI.Restmodule.Entities.User;

public interface UserRepository {

	List<User> findAllUsers();

	User findById(long id);

	User findByEmail(String email);

	User createUser(User user);

	User updateUser(long id, User user);

	void deleteUserById(long id);

	void deleteAllUsers();

	

}
