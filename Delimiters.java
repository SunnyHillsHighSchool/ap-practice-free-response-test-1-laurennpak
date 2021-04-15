import java.util.*;

public class Delimiters
{
	private String openDel;
	private String closeDel;

	public Delimiters(String open, String close)
	{
		openDel = open;
		closeDel = close;
	}

	public ArrayList<String> getDelimitersList(String[] tokens)
	{
    //Create a new arraylist that holds delimiters
    ArrayList<String> delimiters = new ArrayList<String>();
    //For-each loop that traverses through tokens
    for (String t : tokens)
    {
      //If current element is an open or closed delimiter
      if (t.equals(openDel) || t.equals(closeDel))
      {
        //Add the current element into delimiters list
         delimiters.add(t);
      }
    }
    //return delimiters arraylist
    return delimiters;

	}

	public boolean isBalanced(ArrayList<String> delimiters)
	{ 
    //create new int openCount that stores # of occurrences of open delimiter
		int openCount = 0;
    //create new int closedCount that stores # of occurrences of closed delimiter
    int closedCount = 0;
    
    //for-each loop that traverses through delimiters
    for(String d : delimiters)
    {
      //if current element equals an open delimiter
      if(d.equals(openDel))
      {
        //increment openCount
        openCount++;
      }
      //if current element equals a closed delimiter
      if(d.equals(closeDel))
      {
        //increment closedCount
        closedCount++;
      }
      //if closedCount is greater than openCount (uneven)
      if(closedCount > openCount)
      {
        //return ralse
        return false;
      }
      //if openCount is equal to closedCount
      if(openCount == closedCount)
      {
        //return true
        return true;
      }
    }
    //return false
    return false;
	}
}