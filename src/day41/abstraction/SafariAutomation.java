package day41.abstraction;

public class SafariAutomation implements BrowserAutomation  {

	@Override
	public void open() {
		System.out.println("Open Safari browser");
	}

	@Override
	public void close() {
		System.out.println("Close Safari browser");	
	}

	@Override
	public void openUrl(String url) {
		System.out.println("Open Url is Safari");	
		System.out.println(url);
	}

	@Override
	public void click(String element) {
		System.out.println("Click on: " + element);
	}

	@Override
	public void typeTxt(String element, String txt) {
		System.out.println("Type to: " + element);
		System.out.println("Typing: " + txt);
	}

	@Override
	public String readText(String element) {
		return "Java book";
	}
	
}
