package day41.abstraction;

public interface BrowserAutomation {
	public abstract void open();
	
	public abstract void close();
	
	public abstract void openUrl(String url);
	
	public abstract void click(String element);
	
	public abstract void typeTxt(String element, String txt);
	
	public abstract String readText(String element);
	
}
