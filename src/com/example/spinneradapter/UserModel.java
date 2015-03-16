package com.example.spinneradapter;
public class UserModel{
	String name="";
	String email="";
	String message="";

	public  UserModel(String name, String email,String message)
	{
		this.name=name;
		this.email=email;
		this.message=message;
	}
	public String getEmail()
	{
		return email;
	}
	public String getName()
	{
		return name;
	}
	public String getMessage()
	{
		return message;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setMessage(String message)
	{
		this.message=message;
	}
}



