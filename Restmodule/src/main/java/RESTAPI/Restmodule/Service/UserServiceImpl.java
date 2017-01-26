package RESTAPI.Restmodule.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import RESTAPI.Restmodule.Entities.User;
import RESTAPI.Restmodule.Exception.BadRequestException;
import RESTAPI.Restmodule.Exception.UserNotFoundException;
import RESTAPI.Restmodule.Repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	public List<User> findAllUsers() {
		return userRepository.findAllUsers();

	}

	public User findById(long id) {
		User u = userRepository.findById(id);
		if (u == null) {
			throw new UserNotFoundException("User not found");
		}
		return u;

	}

	public User createUser(User user) {
		User exists = userRepository.findByEmail(user.getEmail());
		if (exists != null) {
			throw new BadRequestException("user with the email already exists");
		}
		return userRepository.createUser(user);
	}

	public User updateUser(long id, User user) {
		User exists = userRepository.findById(id);
		if (exists == null) {
			throw new UserNotFoundException("user does not exist");
		}
		return userRepository.updateUser(id, user);
	}

	public  void deleteUserById(long id) {
		User exists = userRepository.findById(id);
		if (exists == null) {
			throw new UserNotFoundException("user does not exist");
		}
		else userRepository.deleteUserById(id);
	}

	public void deleteAllUsers() {

		userRepository.deleteAllUsers();
	}

}
