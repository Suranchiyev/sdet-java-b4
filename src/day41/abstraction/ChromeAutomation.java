package day41.abstraction;

public class ChromeAutomation implements BrowserAutomation{

	@Override
	public void open() {
		System.out.println("Open Chrome browser");
	}

	@Override
	public void close() {
		System.out.println("Close Chrome browser");
		
	}

	@Override
	public void openUrl(String url) {
		System.out.println("Open url: " + url);
		System.out.println("In chrome browser");
	}

	@Override
	public void click(String element) {
		System.out.println("Click on: " + element);
	}

	@Override
	public void typeTxt(String element, String txt) {
		System.out.println("Typing: " + txt);
		System.out.println("In " + element);
		
	}

	@Override
	public String readText(String element) {
		System.out.println("Reading text from " + element);
		return "Java book";
	}

	public double getChromeVersion() {
		return 5.17;
	}
}
