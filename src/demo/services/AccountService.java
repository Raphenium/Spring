package demo.services;

import demo.entities.Account;

public interface AccountService {

	Account login(String username, String password);

	Account signUp(Account account);

	Account changeProfile(Account account);

}
