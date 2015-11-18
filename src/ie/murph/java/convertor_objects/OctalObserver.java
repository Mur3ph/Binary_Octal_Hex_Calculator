package ie.murph.java.convertor_objects;

import ie.murph.java.abstractinterface.ObserverPattern;
import ie.murph.java.main.Subject;

public class OctalObserver extends ObserverPattern
{

	public OctalObserver(Subject subject)
	{
      this.subject = subject;
      this.subject.addObjectToList(this);
    }

   @Override
   public void update() 
   {
     System.out.println("Octal String: " + Integer.toOctalString( subject.getStateValueIntegerThatWasChanged())); 
     System.out.println("My Octal String convertor: " + convertDecimalToOctal(subject.getStateValueIntegerThatWasChanged()));
   }
   
   public static int convertDecimalToOctal(int octalNumber)
   {
	   int counter=0;
	   int result = 0;
	   while(octalNumber !=0) {
		   	//Percentage sign is a modulus operation, which returns the remainder of the first operand divided by the second operand
		   // Then multiplying to change it back to decimal 
	        int temp = (int) ((octalNumber%8) * Math.pow(10, counter));
	        counter++;
	        result += temp;
	        octalNumber /= 8;
	    }
	    return result;
	}

}
