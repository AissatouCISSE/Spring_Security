package sn.lpa.arlwebsite.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sn.lpa.arlwebsite.entities.AppUser;
import sn.lpa.arlwebsite.entities.RegisterConfirm;
import sn.lpa.arlwebsite.service.AccountService;


@RestController
public class UserController {
	@Autowired
	private AccountService accountService;
	
	

    @PostMapping("/register")
    @ResponseBody
    public AppUser register(@RequestBody RegisterConfirm userForm) {
    	if(!userForm.getPasssword().equals(userForm.getRepasssword()))
    		throw new RuntimeException("Confirmer votre mot de passe");
    	AppUser user = accountService.findUserByUsername(userForm.getUsername());
    	if(user!=null)
    		throw new RuntimeException("cette adresse est deja utilise");
    	AppUser appUser = new AppUser();
    	appUser.setPasssword(userForm.getPasssword());
    	appUser.setUsername(userForm.getUsername());
    	accountService.saveUser(appUser);
        accountService.addRoleToUse(userForm.getUsername(), "USER1");
        return appUser;
    }

   
}
