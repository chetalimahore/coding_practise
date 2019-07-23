package com.amazon;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.regex.Pattern;

public class UniqueEmail {

	public static int numUniqueEmails(String[] emails) {
	        
	        HashSet<String> set = new HashSet();
	        for(String email : emails){
	            String[] emailParts = email.split("@");
	            String localName = emailParts[0];
	            String domainName = emailParts[1];
	            
	            int plusIndex = localName.indexOf("+");
	            if(plusIndex >= 1 && plusIndex < localName.length()){
	                localName = localName.substring(0, plusIndex);
	            }
	            
	            localName = localName.replace(".", "");
	            
	            String finalString = localName + "@" + domainName;
	            
	            set.add(finalString);
	        }
	        
	        return set.size();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String emails[] = {"testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"};
		System.out.println(numUniqueEmails(emails));
		
		Pattern regex = Pattern.compile("[^]^[0-9a-zA-Z]");
		
		BigDecimal big = new BigDecimal("0.0");
		
	}

}
