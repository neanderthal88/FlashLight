package com.smile.smileflashlightforth;

import java.util.LinkedList;
import java.util.List;

import android.app.Activity;
import android.app.Application;

public class ExitApplication extends Application {
	private List<Activity> activityList = new LinkedList<Activity>();
	private static ExitApplication instance;
	
	//封装构造方法
	private ExitApplication()
	{
		//构造方法，构造方法的作用是初始化对象
	}
		
		//通过静态方法取得ExitApplication类的实例
	public static ExitApplication getInstance()
	{
		if (instance == null) 
		{
			instance = new ExitApplication();
		}
		return instance;
	}
	
	public void addActivity(Activity activity)
	{
		activityList.add(activity);
	}
	
	public void exit()
	{
		for(Activity activity:activityList)
		{
			activity.finish();
		}
		System.exit(0);
	}

}
