package pille.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pille.exception.ServiceException;
import pille.service.IAddEmailService;
import pille.service.IAddWebsiteService;

@RestController
public class Controller {
	
	private IAddWebsiteService addWebsiteService;
	
	private IAddEmailService addEmailService;
	
	@Autowired
	public Controller(IAddWebsiteService addWebsiteService, IAddEmailService addEmailService) {
		this.addWebsiteService = addWebsiteService;
		this.addEmailService = addEmailService;
	}




	@GetMapping("/add")
	public String addWebsite(
			@RequestParam(name = "page", required = false) Optional<String> url,
			@RequestParam(name = "email", required = false) Optional<String> email) {
		
		if(url.isPresent()) {
			try {
				addWebsiteService.addWebsite(url.get());
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		
		if(email.isPresent()) {
			try {
				addEmailService.addEmail(email.get());
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		
		return "Success";
	}
	
	

}
