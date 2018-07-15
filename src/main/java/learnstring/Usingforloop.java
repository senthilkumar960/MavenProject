package learnstring;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Usingforloop {

	public static void main(String[] args) {

		String stringWithDuplicates = "afsjeadrffafvgdefeverhfgberAAad";
		char[] characters = stringWithDuplicates.toCharArray();
		int length = characters.length;
	for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (characters[i] == characters[j]) {
                    int temp = j;//set duplicate element index
 
                    //delete the duplicate element by shifting the elements to left
                    for (int k = temp; k < length - 1; k++) {
                    	characters[k] = characters[k + 1];
                    }
                    j--;
                    length--;//reduce char array length
 
                }
            }
        }
	String stringWithOutDuplicates = new String(characters);
	stringWithOutDuplicates = stringWithOutDuplicates.substring(0, length);
	System.out.println(stringWithOutDuplicates);
}
	
		
/*
		
		String name = "facebooooook";
		List<Character> list = new ArrayList<Character>();
		char[] charArray = name.toCharArray();
		for (char c: charArray ) {
			if (!list.contains(c)) {
				list.add(c);
				
			}
			
	
		}
		System.out.println(list);*/
		/*
		String name = "facebook";
		Set<Character> uniqueChar = new LinkedHashSet<Character>();
		char[] charArray = name.toCharArray();
		for (char c: charArray) {
			uniqueChar.add(c);
		}
		System.out.println(uniqueChar);
		}
		
	*/	
	/*	String fullname = "Senthilkumar";
		int length = fullname.length();
		char[]charArray=fullname.toCharArray();
		for(int i = length-1;i>=0;i--) {
System.out.println(charArray[i]);
	}

*/
		
	/*StringBuffer name = new StringBuffer("Senthil");
	name.reverse();
	System.out.println(name);
	*/
	
	/*	StringBuilder build = new StringBuilder("Senthil");
		build.reverse();
			System.out.println(build);
		*/
		
	}

	
