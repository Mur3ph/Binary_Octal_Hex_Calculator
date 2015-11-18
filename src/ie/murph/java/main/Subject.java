package ie.murph.java.main;

import java.util.ArrayList;
import java.util.List;

import ie.murph.java.abstractinterface.ObserverPattern;

public class Subject 
{
   private List<ObserverPattern> observers = new ArrayList<ObserverPattern>();
   private int stateValueInteger;

   public int getStateValueIntegerThatWasChanged() 
   {
      return stateValueInteger;
   }

   public void setStateValueIntegerToBeChanged(int stateValueInteger) 
   {
      this.stateValueInteger = stateValueInteger;
      notifyAllObservers();
   }

   public void addObjectToList(ObserverPattern observer)
   {
      observers.add(observer);		
   }

   public void notifyAllObservers()
   {
      for (ObserverPattern observer : observers) 
      {
         observer.update();
      }
   } 	
}
