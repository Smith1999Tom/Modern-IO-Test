import java.util.LinkedList;
import java.util.Iterator;

public class Diary {

	LinkedList<DiaryEntry> entryList = new LinkedList<DiaryEntry>();
	Iterator<DiaryEntry> iterator = null;
	
	public boolean add(DiaryEntry newEntry)
	{
		return entryList.add(newEntry);
	}
	
	public void print()
	{
		iterator = entryList.iterator();
		while(iterator.hasNext())
		{
			DiaryEntry entryToPrint = iterator.next();
			System.out.println(entryToPrint.getDateOfMeeting());
			System.out.println(entryToPrint.getStartTime());
			System.out.println(entryToPrint.getEndTime());
			System.out.println(entryToPrint.getDescription());
		}
		System.out.println();
	}
	
}
