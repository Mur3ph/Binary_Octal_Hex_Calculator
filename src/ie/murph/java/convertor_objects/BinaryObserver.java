package ie.murph.java.convertor_objects;

import ie.murph.java.abstractinterface.ObserverPattern;
import ie.murph.java.main.Subject;

public class BinaryObserver extends ObserverPattern
{

	public BinaryObserver(Subject subject)
	{
	  this.subject = subject;
	  this.subject.addObjectToList(this);
	}

   @Override
   public void update() 
   {
      System.out.println("Built-in Binary String convertor: " + Integer.toBinaryString(subject.getStateValueIntegerThatWasChanged())); 
      System.out.println("My Binary String convertor: " + convertDecimalToBinaryString(subject.getStateValueIntegerThatWasChanged()));
   }
   
	// Method to find the (6 bit) binary equivalent of an integer - or change the length of loops to whatever size bit you need
	// A number between 0-63
	private static String convertDecimalToBinaryString(int integerValue) 
	{
		String binaryString = "";
		for(int x = 0; x < 6; x++)
		{
			//If the value has a remainder print '1' bit
			if(integerValue % 2 == 1)
			{
				binaryString = "1" + binaryString;
			}
			//If the value has no remainder print '0' bit
			if(integerValue % 2 == 0)
			{
				binaryString = "0" + binaryString;
			}
			integerValue = integerValue/2;
		}
		return binaryString;
	}// END OF..

}
