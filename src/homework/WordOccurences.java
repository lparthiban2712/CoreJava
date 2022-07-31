package homework;

import java.util.HashMap;

public class WordOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String content="Green World Clean World Love World";
		String[] words=content.split(" ");
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		
		for(String word:words)
		{
			if(map.get(word)==null)
			{
				map.put(word, 1);
			}
			else
			{
				map.put(word, map.get(word)+1);
			}
		}
		
		System.out.println(map);
		

	}

}
