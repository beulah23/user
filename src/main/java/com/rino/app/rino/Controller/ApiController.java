package com.rino.app.rino.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rino.app.rino.Model.User;
import com.rino.app.rino.Repo.UserRepo;

@RestController
public class ApiController {

	@Autowired
	UserRepo userrepo;

	@GetMapping("/users")
	public List<User> getUsers() {
		return userrepo.findAll();
	}

	@PostMapping("/save")
	public String save(@RequestBody User user) {
		userrepo.save(user);
		return "saved!";
	}

	@PutMapping("update/{id}")
	public String update(@PathVariable long id, @RequestBody User user) {
		User updatedUser = userrepo.findById(id).get();
		updatedUser.setFname(user.getFname());
		updatedUser.setLname(user.getLname());
		updatedUser.setAge(user.getAge());
		updatedUser.setOccupation(user.getOccupation());
		userrepo.save(updatedUser);
		return "updated!";

	}
}
