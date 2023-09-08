package TestScripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib1.General;

public class TC_Hrm {
	
	@Test
	public void tc001() throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		General gen =new General();
		gen.openApplication();
		gen.login();
		gen.enterFrame();
		gen.addEmpl();
		gen.exitFrame();
		gen.logout();
	}
		
}
	
