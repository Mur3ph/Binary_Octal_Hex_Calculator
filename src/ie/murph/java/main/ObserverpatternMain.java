package ie.murph.java.main;

import ie.murph.java.convertor_objects.BinaryObserver;
import ie.murph.java.convertor_objects.HexadecimalObserver;
import ie.murph.java.convertor_objects.OctalObserver;

public class ObserverpatternMain 
{
//	http://www.tutorialspoint.com/design_pattern/observer_pattern.htm
	
	public static void main(String[] args)
	{
		Subject subject = new Subject();

	      new HexadecimalObserver(subject);
	      new OctalObserver(subject);
	      new BinaryObserver(subject);

	      System.out.println("First state change: 15");	
	      subject.setStateValueIntegerToBeChanged(15);
	      System.out.println("Second state change: 10");	
	      subject.setStateValueIntegerToBeChanged(10);
	}
}
