package test;

public class StringComp {
	
	static int count=0;
	  static String str="";
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ACDCBCDC";
	    String str2 = "CDC";
	    int i =0;
	    while(i<str1.length())
	    {
	      
	      for(int j=0;j<str2.length();j++)
	      {
	    	  System.out.println("i before"+i);
	        	if(str1.charAt(i) == str2.charAt(j))
	            {
	              str += str1.charAt(i)+"";
	              i++;
	              System.out.println(str);
	            }

	        	if(str.equals(str2) && str2.charAt(1) == str1.charAt(i))
	                {
	            	  System.out.println("inside 1");
	                  count ++;
	                  str = "";
	                  i = i-2;
	                } 
	        	else if(str.equals(str2)) {
	            	  System.out.println("inside 2");
	            	  count++;
	            	  str ="";
	              }
	        	
	              System.out.println("i "+i);
	              System.out.println("j "+j);
	              
	              if(i == str1.length())
	              {
	            	  System.out.println("inside if");
	            	  break;
	              }
	     	 
	      }
	      i++;
	   	   
	    }
	    System.out.println(count);
	}

}
