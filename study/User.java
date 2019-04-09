package com.neuedu.study;

public class User {

 String[] usernames;
 String[] passwords;
 public User() {
	usernames=new String[]{"柯南"};
	passwords=new String[]{"真相只有一个"};
 }
 
 public boolean checkUser(String username,String password) {
	 for(int i=0;i<usernames.length;i++) {
		 if(usernames[i].equals(username)&&passwords[i].equals(password))
			 return true;
	 }
	 return false;
	 
 }
}
