package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.utilites.genericMethods;

public class zohoLogin {
	 
	@Test
	public void printStatement() throws IOException {
		genericMethods gm = new genericMethods();
		gm.readTheDataFromProperty("Pass");
		
	System.out.println(gm.readDataFromExcel(0, 1));
	}
	 

}
