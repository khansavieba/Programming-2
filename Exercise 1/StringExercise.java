/**
(a) declare the variable town as a reference to a String object and inialize it to "
UUM Sintok ".
(b) write an assignment statement that invokes the length method of the String class to
find the length of the college String object and assigns the result to the
stringLength variable
(c) complete the assignment statement so that change1 contains the same characters as
college but all in upper case
(d) complete the assignment statement so that change2 is the same as change1
except all capital O's are replaced with the asterisk (*) character.
(e) complete the assignment statement so that change3 is the concatenaon of
college and town (use the concat method of the String class rather than the +
operator)

***/
// **************************************************
// StringExercise.java
//
// Play with String objects
// **************************************************
public class StringExercise
{
public static void main (String[] args)
{
String college = new String ("College of Arts and Sciences");
String town = ("UUM Sintok"); // part (a)
int stringLength;
String change1, change2, change3;
stringLength = college.length(); // part (b)
System.out.println (college + " contains " + stringLength + "characters.");
change1 = college.toUpperCase(); // part (c)
System.out.println ("The string is all in upper case: " + change1);
change2 = change1.replace("O","*"); // part (d)
System.out.println ("All capital O's are replaced with the asterisk character: " + change2);
change3 = college.concat(town); // part (e)
System.out.println ("The final string is " + change3);
}
}