package ma.pfa.gestion_evenement.Mapper;

import ma.pfa.gestion_evenement.entity.Compte;

public class CompteToClient {
	
    private Long id;
    private String login;
    private String privilege;
	public CompteToClient(Long id, String login, String privilege) {
		super();
		this.id = id;
		this.login = login;
		this.privilege = privilege;
	}
	public CompteToClient() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPrivilege() {
		return privilege;
	}
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
    
	public CompteToClient mapCompteToClient(Compte compte){
		CompteToClient client = new CompteToClient();
		client.setId(compte.getId());
		client.setLogin(compte.getLogin());
		client.setPrivilege(compte.getPrivilege());
		return client;
	}
    
}
