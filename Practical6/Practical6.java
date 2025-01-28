public class Practical6{
 
	static void displaypattern1(int size){
	  for(int ln=1; ln<=size; ln++){
	    for(int bl=size-ln; bl>0; bl--){
	      System.out.print(" ");
	    }
	    for(int plus=2*ln-1; plus>0; plus--){
	    System.out.print("+");
	    }
	    System.out.print("\n");
	  }
	  
	  for(int ln=size-1; ln>0; ln--){
	    for(int bl=size-ln; bl>0; bl--){
	    System.out.print(" ");
	    }
	    for(int plus=2*ln-1; plus>0; plus--){
	    System.out.print("+");
	    }
	    System.out.print("\n");
	  }
	}
	
	static void displaypattern2(int size){
	  for(int ln=1; ln<=size; ln++){
	    for(int bl=size-ln; bl>0; bl--){
	      System.out.print(" ");
	    }
	    for(int symbol=2*ln-1; symbol>0; symbol--){
	      if(symbol%2!=0){
	        System.out.print("+");
	      }
	      else{
	        System.out.print(" ");
	      }
	    }
	    System.out.print("\n");
	  }
	  
	  for(int ln=size-1; ln>0; ln--){
	    for(int bl = size-ln; bl>0; bl--){
	      System.out.print(" ");
	    }
	    for(int symbol=2*ln-1; symbol>0; symbol--){
	      if(symbol%2!=0){
	        System.out.print("*");
	      }
	      else{
	        System.out.print(" ");
	      }
	    }
	    System.out.print("\n");
	  }
	}
	
	static void displaypattern3(int size){
	  for(int ln=1; ln<=size; ln++){
	    for(int bl=size-ln; bl>0; bl--){
	      System.out.print(" ");
	    }
	    for(int symbol=2*ln-1; symbol>0; symbol--){
	      if((symbol+ln)%2==0){
	        System.out.print("*");
	      }
	      else{
	        System.out.print("+");
	      }
	    }
	    System.out.print("\n");
	  }
	  
	  for(int ln=size; ln>0; ln--){
	    for(int bl = size-ln; bl>0; bl--){
	      System.out.print(" ");
	    }
	    for(int symbol=2*ln-1; symbol>0; symbol--){
	      if((symbol+ln)%2==0){
	        System.out.print("+");
	      }
	      else{
	        System.out.print("*");
	      }
	    }
	    System.out.print("\n");
	  }
	}
	
	
	  public static void main(String args[]){
	 displaypattern1(3);
	 displaypattern2(3);
	 displaypattern3(3);
  }
	
}
