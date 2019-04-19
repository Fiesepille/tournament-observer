package pille.controller;

import java.io.IOException;
import java.text.ParseException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pille.service.AddWebsiteService;

@RestController
public class Controller {
	
	private AddWebsiteService addWebsiteService;
	
	public Controller(AddWebsiteService addWebsiteService) {
		this.addWebsiteService = addWebsiteService;
	}



	@GetMapping("/AddPage")
	public String addWebsite(@RequestParam(name = "page") String url) {
		
		try {
			addWebsiteService.addWebsite(url);
		} catch (IOException | ParseException e) {
			return "Failed";
		}
		
		return "Success";
	}
	

}
