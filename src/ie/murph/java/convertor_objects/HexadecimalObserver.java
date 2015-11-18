package ie.murph.java.convertor_objects;

import ie.murph.java.abstractinterface.ObserverPattern;
import ie.murph.java.main.Subject;

public class HexadecimalObserver extends ObserverPattern
{
	private static final int  m_sizeOfIntInHalfBytes = 8;
	private static final int m_numberOfBitsInAHalfByte = 4;
	private static final int m_halfByte = 0x0F;
	private static final char[] hexDigits = { 
	    '0', '1', '2', '3', '4', '5', '6', '7', 
	    '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
	  };
	
	
	public HexadecimalObserver(Subject subject)
	{
	  this.subject = subject;
	  this.subject.addObjectToList(this);
	}

   @Override
   public void update() 
   {
	  //Test with: 305445566 returns 1234BABE
      System.out.println("Hex String: " + Integer.toHexString( subject.getStateValueIntegerThatWasChanged() ).toUpperCase() ); 
      System.out.println("My Hexidecimal String convertor: " + convertDecimalToHex(subject.getStateValueIntegerThatWasChanged()));
   }

   public static String convertDecimalToHex(int dec) 
   {
	    StringBuilder hexBuilderResult = new StringBuilder( m_sizeOfIntInHalfBytes);
	    hexBuilderResult.setLength( m_sizeOfIntInHalfBytes);
	    for (int x =  m_sizeOfIntInHalfBytes - 1; x >= 0; --x)
	    {
	      int j = dec & m_halfByte;
	      hexBuilderResult.setCharAt(x, hexDigits[j]);
	      // >> are Bitwise Bit shift operators. The signed right shift operator ">>" shifts a bit pattern to the right.
	      //http://stackoverflow.com/questions/13387365/what-do-or-in-java-mean
	      dec >>= m_numberOfBitsInAHalfByte;
	    }
	    return hexBuilderResult.toString(); 
	  }
   
}
