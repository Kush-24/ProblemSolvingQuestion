package com.kush.java.important;
/*
 * Important Questions:
0> Why string is Immutable in JAVA ?
1> What is an immutable class in Java ?
2> Why are immutable classes important?
3> What are the challenges of designing immutable classes?
4> Do immutable classes thread safe? If yes then how?
5> What precautions you need to take if you are working with mutable instance variables?
6> Why immutable objects are considered to be good keys for HashMap?
7> Can you give some good examples of immutable classes?
 */

import java.util.ArrayList;

//class should be final so it can't be inherited
public final class ImmutableClass {
	
 private final String countryName; //fields should be private and final
 private final ArrayList<String> listOfStates; //so it can't be accessible and changable. 

 public ImmutableClass(String countryName, ArrayList<String> listOfStates) {
  super();
  this.countryName = countryName;
  
  // Creating deep copy for mutable object
  ArrayList<String> tempList = new ArrayList<String>();

  for (int i = 0; i < listOfStates.size(); i++) {
   tempList.add(listOfStates.get(i));
  }
  this.listOfStates = tempList;
 }

 public String getCountryName() {
  // Do not need to do cloning as it is immutable object
  return countryName;
 }

 @SuppressWarnings("unchecked")
public ArrayList<String> getListOfStates() {
     // Returning cloned object 
  return (ArrayList<String>) listOfStates.clone();
 }
 
 //setters are not required. 
 
	public static void main(String args[]) {
		ArrayList<String> listOfStates = new ArrayList<String>();
		listOfStates.add("Madhya Pradesh");
		listOfStates.add("Maharastra");
		listOfStates.add("Gujrat");

		ImmutableClass country = new ImmutableClass("India", listOfStates);
		System.out.println("Country : " + country.getCountryName());
		System.out.println("List of states : " + country.getListOfStates());
		// It will be not change the list as its immutable
		country.getListOfStates().add("Kerala");
		// If we won't use deep cloning , it will add to the list of the class. 
		listOfStates.add("Rajasthan");
		System.out.println("Updated List of states : " + country.getListOfStates());

	}
}



/*
1> What is an immutable class in Java ?
Immutable classes are classes whose instances cannot be modified after creation.

2> Why are immutable classes important?
Immutable classes provide several benefits such as thread-safety, easier caching,
 and easier debugging because they guarantee that their state will not change once instantiated.
 
3> What are the challenges of designing immutable classes?
 One challenge is dealing with mutable components such as collections or arrays within the class,
 as their state can still be modified. Another challenge is providing efficient ways to
  create modified copies of immutable objects
  
4> Do immutable classes thread safe? If yes then how?
Immutable classes are thread safe because you can not change state of immutable objects,
 so even if two thread access immutable object in parallel, it won’t create any issue.
 
5> What precautions you need to take if you are working with mutable instance variables?
If you are working with mutable instance variable(addresses list in above Employee class) then do following:
> Do deep copy mutable variable in constructor.
> Return clone of instance variable from getter of that instance variable rather than actual variable.
 
6> Why immutable objects are considered to be good keys for HashMap?
Answer : Immutable object’s hashcode won’t change, so it makes key retrieval faster as you can
cache different hashcode for different keys. In case of mutable object, hashcode may be dependent
on mutable fields, if any value for these field changes, it might change hashcode, 
so you might not able to find your key in HashMap as hashcode is different now.

7> Can you give some good examples of immutable classes?
String, Integer, Long, Double, Character, Boolean etc and much more. Date is not an immutable class.

8> Why String is Immutable in Java ?
String pool.
Thread safe. 
Security.
Cache hash value.
Class loading.

 */
