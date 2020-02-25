package newTpSpring;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository User2R;
	
	public User2 save(User2 entity) {
		 return User2R.save(entity);
	}
	
	public User2 findOneByLogin(String login) {
		return User2R.findOneByLogin(login);
	}
	
	public User2 create(User2 u) {
		return User2R.save(u);
	}

	public User2 findById(Long id) {
		return User2R.find(id);
	}
	
	public List<User2> findAll(){
		return User2R.findAll();
	}
	
	public void update(User2 u) {
		User2R.update(u);
	}
	
	public User2 delete(Long id) {
		return User2R.delete(id);
	}
}
