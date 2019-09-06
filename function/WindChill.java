package com.bridgeit.function;


public class WindChill {

	public static void main(String[] args) {
     double t ,v;
      t = Double.parseDouble(args[0]);
      v = Double.parseDouble(args[1]);
     if(t>50 && v>120 && v<3)
     {
    	 System.out.println("windchill is in  range:");
   	}
     else {
    	 double w = 35.74 +(0.6215*t) + (0.4275*t-35.75)*Math.pow(v, 0.16);
    	 System.out.println("windchill:" + w);
   		
   	}

	
	}

}
