package com.amazon;

public class CompareVersion {
	
	public static int compareVersion(String version1, String version2) {
        
		String[] arr1 = version1.split("\\.", 2);
        String[] arr2 = version2.split("\\.", 2);
        
        String mainVersion1 = arr1[0]; 
        String mainVersion2 = arr2[0];
        
        arr1[1] = arr1[1].replace(".", "");
        arr2[1] = arr2[1].replace(".", "");
        
        int diff1 = mainVersion1.compareTo(mainVersion2);
        
        
        if(diff1 == 0){
        	int diff = arr1[1].compareTo(arr2[1]);
            if(diff >= 1){
                return 1;
            }
            else if(diff == 0){
                return 0;
            }
            else if(diff < 0){
                return -1;
            }
        }
        else if(diff1 >= 1) {
        	return 1;
        }
        	return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		System.out.println(compareVersion("0.9", "1.1.0"));
	}

}
