package com.edu;

public class OnlineClass 
{

	private Network nob;

	public OnlineClass(Network nob) {
		super();
		this.nob = nob;
	}
	
	public void onlineClassFunction()
	{
		if(nob!=null)
		{
			nob.networkDisplay();
		}
		else
		{
			System.out.println("Network is not good");
		}
	}
}
