package com.EmpTrail5.Server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.EmpTrail5.Controller.clsCont;
import com.EmpTrail5.Exception.NoIdException;
import com.EmpTrail5.Model.classStGtMeth;

@RestController
public class clsServ {
	
	@Autowired
	private clsCont empCon;
	
	@GetMapping("/user")
	public List<classStGtMeth> getFullList(){
		return empCon.fullList();
	}
	
//	ResponseEntity<Object>
	@GetMapping("/user/{Id}")
	public classStGtMeth getOneData(@PathVariable int Id) {
//		try {
//			return new ResponseEntity<Object>(empCon.oneData(Id), HttpStatus.ACCEPTED);
//		} catch (Exception e) {
//			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
//		}
		
		return empCon.oneData(Id);
		
	}
	
}
