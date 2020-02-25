package newTpSpring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	// create
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void create(User2 ressource) {
		userService.create(ressource);
	}
	
	// read
	@RequestMapping(value ="/{id}", method = RequestMethod.GET)
	public @ResponseBody User2 findById(@PathVariable Long id) {
		return userService.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<User2> findAll(){
		return userService.findAll();
	}
	
	// update
	@RequestMapping(method = RequestMethod.PUT)
	public void update(@RequestBody User2 ressource) {
		userService.update(ressource);
	}
	
	//delete
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody User2 delete(@PathVariable Long id) {
		return userService.delete(id);
	}

}
