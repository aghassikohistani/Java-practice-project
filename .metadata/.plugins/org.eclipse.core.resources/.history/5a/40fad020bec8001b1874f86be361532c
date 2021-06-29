package com.Kohistani.SeleniumPractice;

public class FacebookTest {

	public static void main(String[] args) {

		BrowserUtility br = new BrowserUtility();
		br.initalizeDriver("Chrome");

		br.launchUrl("http://ww38.offroadtechinc.com/");

		String title = br.getPageTitle();

		if (title.contains("offroadtechinc.")) {
			System.out.println("this is the right page");
		} else {
			System.out.println("Something is wrong with your title");
		}

	}

}
