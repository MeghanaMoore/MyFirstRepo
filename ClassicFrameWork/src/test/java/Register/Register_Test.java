package Register;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class Register_Test extends BaseClass {
		@Test
		public void RegisterToDemoWebShop() {
			reg.getRegisterLink().click();
			reg.getgenderButton().click();
			reg.getfirstName().sendKeys("Meghana");
			reg.getlastName().sendKeys("Moore");
			reg.getEmail().sendKeys("meghana@gamil.com");
			reg.getPass().sendKeys("***********");
			reg.getcpass().sendKeys("*******");
			reg.getregButton().click();
			
		}
		

	}

