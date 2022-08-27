package com.EmpTrail5.Model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class classObj {

	@Autowired
	private classStGtMeth clsg;
	
private static List<classStGtMeth> userDataEmp = new ArrayList<classStGtMeth>();
	
	static {
		userDataEmp.add(new classStGtMeth(1,"Nikhil","DevOps",20000));
		userDataEmp.add(new classStGtMeth(2,"Mahesh","Sales Manager",70000));
		userDataEmp.add(new classStGtMeth(3,"Abhil","DevOps",80000));
		userDataEmp.add(new classStGtMeth(4,"Teja","BackEnd",40000));
		userDataEmp.add(new classStGtMeth(5,"Rakshith","Cyber Securities",50000));
		userDataEmp.add(new classStGtMeth(6,"Raga","Sport",90000));
		userDataEmp.add(new classStGtMeth(7,"Ravi","Sql",30000));
		userDataEmp.add(new classStGtMeth(8,"NIKI","Hello",20000));
	}
	
	public static List<classStGtMeth> getList()
	{return userDataEmp;}
}
