package tusharseleniumtest;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://google.com");
//		
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		
//		driver.quit();
		
		int[] a1 = {11, 22, 33, 44, 55};
		for(int ele: a1) {
			System.out.println(ele);
		}
		
		System.out.println("------------------------------");
		
		int[] a2 = new int[5];
		for (int i=0; i<a2.length; i++) {
			a2[i] = (i+1)*100;
		}
		for (int i : a2) {
			System.out.println(i);
		}
		
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(9);
		a3.add(8);
		a3.add(7);
		a3.add(6);
		a3.remove(3);
		System.out.println(a3);
		System.out.println(a3.get(0));
		System.out.println(a3.contains(7));
		
		String s1 = "Tushar Ashok Patne";
		for (int i = s1.length()-1; i >= 0; i--) {
			System.out.print(s1.charAt(i));
		}
		
		int left = 0;
		int right = s1.length()-1;
		char[] temp = s1.toCharArray();
		while(left < right) {
			char c = temp[left];
			temp[left] = temp[right];
			temp[right] = c;
			left++;
			right--;
		}
		System.out.println();
		System.out.println(temp);

	}

}
