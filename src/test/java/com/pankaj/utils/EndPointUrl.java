package com.pankaj.utils;

public enum EndPointUrl {

	
	 String resourcePath;
	
	EndPointUrl(String resourcePath)
	{
	this.resourcePath = resourcePath;
	}
	
	
	public String getResourcePath()
	{
		return this.resourcePath;
		
	}
	
	public String getResourcePath(String data)
	{
		return this.resourcePath+data;
	}
}
