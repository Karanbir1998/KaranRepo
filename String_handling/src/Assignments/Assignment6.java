package Assignments;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Assignment6 {

	public static void main(String[] args) throws IOException {
	File f=new File("../String_handling/dummy.txt");
	FileReader fr=new FileReader(f);
	BufferedReader b=new BufferedReader(fr);
	int WordsCount=0,LinesCount=0,CharactersCount=0;	
	String s;
	System.out.println("Data in file:- ");
	while((s=b.readLine())!=null){
		LinesCount++;
		System.out.print(s+"\n");
	    String[] LastString=s.split(" "); 
	    WordsCount+=LastString.length;
	    
	    for (String word : LastString)
        {    
            CharactersCount+=word.length();
        }
	}
	System.out.println();
	System.out.println("Number of lines: "+LinesCount);	
	System.out.println("Number of words: "+WordsCount);	
	System.out.println("Number of characters: "+CharactersCount);	
    b.close();
	}
}