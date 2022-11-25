package com.actitime.testscript;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class ProjectModule {	
	@Test(priority=1,invocationCount=5)   // it will print 5 times
	public void createProject() {
		Reporter.log("createProject",true);
	}
		@Test(priority=2)
						// it will print in 2nd position
		public void modifyProject() {
			Reporter.log("modifyProject",true);
		}										// it will print in 3rd position
		@Test(priority=3)
		public void deleteProject() {
			Reporter.log("deleteProject",true);
		}
}




