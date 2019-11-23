package demo.entities;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "account")

public class Account {
	@Id
	private  String id;
	private  String username;
	private  String password;
	private  String fullName;
	private  boolean status;
	
	public String getId() {
	return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		
	public String getPassword() {
		return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
	
		public String getFullName() {
			return fullName;
			}
			public void setFullName(String fullName) {
				this.fullName = fullName;
			}
			
	public boolean isStatus() {
		return status;
	}
			
	public void setStatus(boolean status) {
		this.status = status;
	}
}

	