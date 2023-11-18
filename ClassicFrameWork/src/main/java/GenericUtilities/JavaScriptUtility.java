package GenericUtilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;

public class JavaScriptUtility extends BaseClass{
	/**
	 * This element is used to enter the data into textfield
	 * @param element
	 * @param data
	 */
	public void enteringTheDataIntoElement(WebElement element,String data) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='"+data+"'", element);
	}
	public void ClickingOnElement(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	public void ScrollingThePage(int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("scrollBy("+x+""+y+")");
	}
}
