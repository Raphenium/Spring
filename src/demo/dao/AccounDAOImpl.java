package demo.dao;


import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import demo.entities.Account;

@Repository("accountDAO")
public class AccounDAOImpl implements AccountDAO<Account> {

	@Autowired
	private MongoTemplate mongoTemplate;
	@Override
	public Account login(String username, String password) {
		try {
			Query query = new Query();
			Account account = mongoTemplate
					.findOne(query.addCriteria(
							Criteria.where("username")
							.is(username)), Account.class);
			if(account != null) {
				BCryptPasswordEncoder bCryptPasswordEncoder =
						new BCryptPasswordEncoder();
				if(bCryptPasswordEncoder.matches(password, 
						account.getPassword())) {
					return account;
				}
			}
			return null;
		} catch (Exception e) {
			return null;
		}
	}
		@Override
		public void signUp(Account account) {
			mongoTemplate.insert(account);
	}
		
		@Override
		public void changeProfile(Account account) {
			mongoTemplate.save(account);
		}

}
