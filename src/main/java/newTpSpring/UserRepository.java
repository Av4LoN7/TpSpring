package newTpSpring;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends AbstractJpaRepository<User2> {

	public UserRepository() {
		super(User2.class);
	}
	
	protected UserRepository(Class<User2> type) {
		super(type);
	}
	
	public User2 findOneByLogin(String login) {
		Query query = this.entityManager.createQuery("from User where User.login =:log");
		query.setParameter("log", login);
		return (User2) query.setMaxResults(1).getSingleResult();
	
	}
}
