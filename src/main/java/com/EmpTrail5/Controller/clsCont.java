package com.EmpTrail5.Controller;

import java.util.List;

import org.springframework.stereotype.Component;

import com.EmpTrail5.Exception.NoIdException;
import com.EmpTrail5.Model.classObj;
import com.EmpTrail5.Model.classStGtMeth;


@Component
public class clsCont {
	
	private classObj clO = new classObj();
	
	public List<classStGtMeth> fullList(){
		return clO.getList();
	}
	
	public classStGtMeth oneData(int Id) {	
		classStGtMeth oneEmp = clO.getList().stream().filter(i->i.getId()==Id).findAny().get();
		return oneEmp;
	}
	
}
