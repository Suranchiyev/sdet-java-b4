package day41.abstraction;

public class TestAutomation {
	public static void main(String[] args) {
		BrowserAutomation browserDriver = new ChromeAutomation();
		
		browserDriver.open();
		browserDriver.openUrl("https://google.com");
		
		browserDriver.typeTxt("search box", "Books for Java");
		browserDriver.click("search btn");
		
		String res = browserDriver.readText("results");
		
		if (res.contains("Java")) {
			System.out.println("Test pass");
		} else {
			System.out.println("Test failed");
		}
	}
}
