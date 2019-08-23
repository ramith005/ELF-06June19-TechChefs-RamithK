package com.techchefs.librarymngt.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techchefs.librarymngt.dto.Book;
import com.techchefs.librarymngt.dto.Response;
import com.techchefs.librarymngt.dto.UserBean;
import com.techchefs.librarymngt.service.LibraryServiceImpl;
@CrossOrigin(origins="http://localhost:3000")
@RestController
public class AdminController {
	
	@Autowired
	LibraryServiceImpl libraryService;
	
	@PostMapping(path = "/addUser", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response createUser(@RequestBody UserBean user, HttpServletRequest request) {
		return libraryService.createUser(user, request);
	}
	
	@PostMapping(path="/updateUser",produces=MediaType.APPLICATION_JSON_VALUE)
	public Response updateUser(@RequestBody UserBean user, HttpServletRequest request) {
		return libraryService.updateUser(user, request);
	}
	
	@PutMapping(path="/deactivateUser",produces=MediaType.APPLICATION_JSON_VALUE)
	public Response deActivateUser(@RequestParam int id, HttpServletRequest request) {
		return libraryService.deActivateUser(id, request);
	}
	
	@GetMapping(path="/searchByName", produces=MediaType.APPLICATION_JSON_VALUE)
	public Response searchUserByName(String name, HttpServletRequest request) {
		return libraryService.searchUserByName(name, request);
	}
	
	@GetMapping(path="/getAllUsers", produces=MediaType.APPLICATION_JSON_VALUE)
	public Response searchUserByName( HttpServletRequest request) {
		return libraryService.getAllUser(request);
	}
}
