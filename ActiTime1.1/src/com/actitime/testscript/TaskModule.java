package com.actitime.testscript;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class TaskModule {
@Test(priority=1,invocationCount=5)
public void createTask() {
	Reporter.log("createTask",true);
}
	@Test(priority=2)
	public void modifyTask() {
		Reporter.log("modifyTask",true);
	}
	@Test(priority=3)
	public void deleteTask() {
		Reporter.log("deleteTask",true);
	}
}
