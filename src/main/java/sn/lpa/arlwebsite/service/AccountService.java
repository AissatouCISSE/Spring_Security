package sn.lpa.arlwebsite.service;

import sn.lpa.arlwebsite.entities.AppRole;
import sn.lpa.arlwebsite.entities.AppUser;

public interface AccountService {
	public AppUser saveUser(AppUser user);
	public AppRole saveRole(AppRole role);
	public void addRoleToUse(String username , String libelle);
	public AppUser findUserByUsername(String username);
}
