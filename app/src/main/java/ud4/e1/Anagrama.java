package ud4.e1;

import java.util.Arrays;  
import java.util.Scanner;  
      
  public class Anagrama {  
    private String str1; 
    private String str2;
    private Scanner sc;
    
    public Anagrama() {
    	this.sc = new Scanner(System.in);
    }
    
    public Anagrama(String str1, String str2) {
    	this.str1=str1;
    	this.str2=str2;
    	this.sc = new Scanner(System.in);
    }
    
    
    public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}
	
	public void getInput() {
		System.out.println("Introduce el primer dato a comprobar");
		this.str1=sc.nextLine();
		System.out.println("Introduce el segundo dato a comprobar");
		this.str2=sc.nextLine();
	};

	public boolean checkAnagram(String str1, String str2) {
 
    	if(str1.length() != str2.length()) return false;
    	
    	char[] charArray1 = str1.toCharArray();  
        char[] charArray2 = str2.toCharArray();  
        
        Arrays.sort(charArray1);  
        Arrays.sort(charArray2);  
    	
    	return Arrays.equals(charArray1, charArray2);
    }
    
    public void printResult(boolean checkAnagramResult) {
    	if(checkAnagramResult) {
    		 System.out.println(this.str1 + " and " + this.str2 + " are anagram.");  
     	} else {
     		System.out.println(this.str1 + " and " + this.str2 + " are not anagram.");
     	}
    }
    	
  
    }  