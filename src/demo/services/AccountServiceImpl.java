package demo.services;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;


import demo.dao.AccountDAO;
import demo.entities.Account;

@Service("accountService")
@Transactional
public class AccountServiceImpl implements AccountService {

@Autowired
private AccountDAO<Account> accountDAO;

@Override
public Account login(String username, String password) {
	return accountDAO.login(username, password);
}

@Override
public Account signUp(Account account) {
	accountDAO.signUp(account);
	return account;
}

@Override
public Account changeProfile(Account account) {
	accountDAO.changeProfile(account);
	return account;
}
}
