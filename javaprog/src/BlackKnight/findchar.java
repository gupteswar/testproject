package BlackKnight;

import java.util.HashMap;

public class findchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="aabbcccdddd";
		getdata(str);
		
	}
	
	public static void getdata(String name)
	{
		System.out.println(name);
		
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char[] strArray = name.toCharArray();
		for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                //If char is present in charCountMap, incrementing it's count by 1
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value
                charCountMap.put(c, 1);
            }
        }
		System.out.print(charCountMap);

	}

}
