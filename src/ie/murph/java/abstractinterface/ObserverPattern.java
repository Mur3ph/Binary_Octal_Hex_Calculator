package ie.murph.java.abstractinterface;

import ie.murph.java.main.Subject;

public abstract class ObserverPattern 
{
	protected Subject subject;
	public abstract void update();
}
