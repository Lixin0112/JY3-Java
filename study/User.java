package com.neuedu.study;

public class User {

 String[] usernames;
 String[] passwords;
 public User() {
	usernames=new String[]{"����"};
	passwords=new String[]{"����ֻ��һ��"};
 }
 
 public boolean checkUser(String username,String password) {
	 for(int i=0;i<usernames.length;i++) {
		 if(usernames[i].equals(username)&&passwords[i].equals(password))
			 return true;
	 }
	 return false;
	 
 }
}
