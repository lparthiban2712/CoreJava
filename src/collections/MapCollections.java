	package collections;
	
	import java.util.HashMap;
	
	public class MapCollections {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	HashMap<Integer,String> map=new HashMap<Integer,String>();
	map.put(1, "Parthi");
	map.put(2,"priya");
	map.put(3,"Dev");
	map.put(4,"Hem");
	map.put(4,"Sea");
	map.put(5," ");
	System.out.println(map);
	System.out.println(map.get(3));
	System.out.println(map.get(5));
	map.remove(5);
	System.out.println(map);
	
	for(Integer key:map.keySet())
	{
		System.out.println(key);
		System.out.println(map.get(key));
	}
	
	for(String value:map.values())
	{
		System.out.println(value);
		
	}
	
	
	}
	
		}
