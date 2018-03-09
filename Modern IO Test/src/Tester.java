import java.nio.charset.*;
import java.nio.file.*;
import java.io.*;


/**
 * This aim of this project was to learn how to use the new File Handling classes implemented in
 * SE 7, ie Files and Path. Lookup NIO.2 for more info.
 */

/**
 * 
 * @author Tom Smith
 *
 */
public class Tester {

	/**
	 * @param args Main arguments
	 */
	public static void main(String[] args) {
		
		Charset cs = StandardCharsets.UTF_8;
		Diary testDiary = new Diary();
		
		Path diaryFile = Paths.get("./Files/DiaryFile.txt");
		
		
		try(BufferedReader br = Files.newBufferedReader(diaryFile, cs);)
		{
			while(br.ready())
			{
				String l1 = br.readLine();
				String l2 = br.readLine();
				String l3 = br.readLine();
				String l4 = br.readLine();
				testDiary.add(new DiaryEntry(l1, l2, l3, l4));
			}
		}
		catch(IOException e)
		{
			System.out.println("IOEXCEPTION " + e);
		}
		catch(NullPointerException e)
		{
			System.out.println("NULLPOINTEREXCEPTION " + e);
		}
		
		testDiary.print();
		

	}

}
