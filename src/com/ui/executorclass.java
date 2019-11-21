package com.ui;

import com.selenium.deiverinstance;
import com.selenium.keywords;

public class executorclass {
	public static void startexecution()
	{
		deiverinstance cc = new deiverinstance();
		cc.driver1();
		
		for(int i = 0; i<variables.mymap.size();i++)
		{
			String[] case1 = variables.mymap.get(i);
			
			if(case1[0] == "openurl")
			{
				keywords.openurl(case1[1]);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			else if(case1[0] == "click")
			{
				keywords.click(case1[2]);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			else if(case1[0] == "type")
			{
				keywords.type(case1[1], case1[2]);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	
}
