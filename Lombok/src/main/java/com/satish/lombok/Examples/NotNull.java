package com.satish.lombok.Examples;

import lombok.NonNull;
import lombok.val;
import lombok.var;

public class NotNull {
	
	public void notNullTest(@NonNull String name) {
		System.out.println("*****************--->>"+" "+name);
	}
	
	public static void main( String[] args )
    {
		
		/*
		 * Val and Var only used for declaring the local variables not for the fields and parameters in the function/Constructors. 
		 * Val--> Mark the local variable as final. 
		 * Var--> local variable not marked as final.
		 */
		
		val temp = "Satish";
		var x = "Kumar";
		//temp = "Khitish";
		x = "Rudransh";
		System.out.println(temp+" "+x);
		
		NotNull nn = new NotNull();
		nn.notNullTest(temp);   //replace temp with "null" to understand more and get the compilation error because NonNull tag
		
		
		
		
    }

}
