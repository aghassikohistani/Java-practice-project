package javaPractice;

public class CrossBrowserPractice {

	public static void main(String[] args) {

		String br = browser("Edge");
		System.out.println(br);

	}

	public static String browser(String browser) {

		if (browser.equals("chrome")) {
			System.out.println("Launch Chrome Browser");

		} else if (browser.equals("FireFox")) {
			System.out.println("Launch fire fox browser");
		} else if (browser.equals("Safari")) {
			System.out.println("launch safari browser");
		} else if (browser.equals("Edge")) {
			System.out.println("launch edge browser");
		}

		else {
			System.out
					.println("please pass the right browser, the browser you have passed is" + browser + "is invalid");
		}

		return browser;
	}

}
