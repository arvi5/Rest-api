package RESTAPI.Restmodule.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import RESTAPI.Restmodule.Entities.User;
import RESTAPI.Restmodule.Service.UserService;

@RestController
@RequestMapping(value = "user")
public class UserController {
	
	@Autowired
	UserService userService;
	@RequestMapping(method = RequestMethod.GET )
	public List<User> listAllUsers() {
		return userService.findAllUsers();

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public User getUser(@PathVariable("id") long id) {
		return userService.findById(id);

	}

	@RequestMapping(method = RequestMethod.POST)
	public User createUser(@RequestBody User user) {

		return userService.createUser(user);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public User updateUser(@PathVariable("id") long id, @RequestBody User user) {
		return userService.updateUser(id, user);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable("id") long id) {
		 userService.deleteUserById(id);

	}

	@RequestMapping( method = RequestMethod.DELETE)
	public void deleteAllUsers() {
		userService.deleteAllUsers();

	}

}
