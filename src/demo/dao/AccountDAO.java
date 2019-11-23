package demo.dao;

public interface AccountDAO<Account> {
	public Account login(String username, String password);
	
	public void signUp(Account account);
	
	public void changeProfile(Account account);
}
