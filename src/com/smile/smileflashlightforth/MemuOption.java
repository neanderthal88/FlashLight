package com.smile.smileflashlightforth;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;

public class MemuOption extends Activity {
	private static MemuOption instance;
	
	private MemuOption()
	{
		
	}
	
	public static MemuOption getInstance()
	{
		if(instance == null)
		{
			instance = new MemuOption();
		}
		return instance;
	}
	
	public void back()
	{
		
	}
	
	public void exit()
	{
		ExitApplication.getInstance().exit();
		//System.exit(0);
		//android.os.Process.killProcess(android.os.Process.myPid());
	}
	
	public void about(Activity activity)
	{
		Builder dialog = new AlertDialog.Builder(activity)
		.setTitle("about")
		.setMessage("Thanks for using Smile's flashlight 1.0\nauthor: Smile\nemail: zhiye.wei@gmail.com")
		.setNegativeButton("ok", null);
		dialog.show();
	}
	
}
