package com.tjoeun.collectionTest;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;
=======
import java.util.HashMap;
>>>>>>> 534c0eb8033fb390e68c12295e4a83e4f95b604b

public class HashMapTest2 {
	
	public static void main(String[] args) {
		
<<<<<<< HEAD
		HashMap<String, Integer> hmap = new HashMap<>();
		
		hmap.put("apple" , 1000);
=======
		/*HashMap은 사전식으로 데이터를 저장한다. Key(K)에 Value(V)를 할당하는 방식으로 저장된다.
		 - Key는 String 타입으로 저장하고 Value는 저장할 데이터 타입으로 지정한다.   */
		HashMap<String, Integer> hmap = new HashMap<>();
		
		//put(key , value) 메소드는 HashMap의 Key에 Value를 저장한다.
		hmap.put("apple" , 1000);
		//size() 메소드로 저장된 데이터의 개수를 얻어올 수 있다.
>>>>>>> 534c0eb8033fb390e68c12295e4a83e4f95b604b
		System.out.println(hmap.size() + " :" + hmap);
		hmap.put("banana" , 500);
		System.out.println(hmap.size() + " :" + hmap);
		hmap.put("orange", 1500);
<<<<<<< HEAD
		System.out.println(hmap.size() + " :" + hmap);
		hmap.put("banana" , 3500);
		System.out.println(hmap.size() + " :" + hmap);
		
		
		//keySet() 메소드는 HashMap에 저장된 데이터의 key만 얻어온다.
		System.out.println(hmap.keySet());
		//values() 메소드는 HashMap에 저장된 데이터의 value만 얻어온다.
		System.out.println(hmap.values());
		System.out.println("=============================");
		
		//HashMap에 저장된 데이터의 key만 얻어와서 ArrayList에 저장하기
		ArrayList<String> klist = new ArrayList<>();
		for(String str : hmap.keySet()) {
			klist.add(str);
		}
		System.out.println("배열 list: " + klist);
		
		//HashMap에 저장된 데이터의 value만 얻어와서 ArrayList에 저장하기
		ArrayList<Integer> vlist = new ArrayList<>();
		for(int a : hmap.values()) {
			vlist.add(a);
		}
		System.out.println("배열 list2: " + vlist);
		
		//HashMap에 저장된 데이터의 key를 이용해서 value를 얻어와서 ArrayList에 저장하기
		ArrayList<Integer> list = new ArrayList<>();
		for(String key : hmap.keySet()) {
			list.add(hmap.get(key));
		}
		System.out.println(list);
=======
		
		/* HashMap에 저장된 데이터를 수정하려면 put(key, vlaue)를 사용해서 수정한다.
		 -put() 메소드로 없는 key에 데이터를 할당하면 데이터가 저장되고 있는 key에 데이터를 할당하면
	     그 key에 저장된 데이터가 수정된다. */
		hmap.put("banana" , 1500);
		System.out.println(hmap.size() + " :" + hmap);
		
		//get(key) 메소드는 HashMap에 저장된 데이터 중에서 key에 해당되는 value를 얻어온다.
		System.out.println(hmap.get("banana"));
		//존재하지 않는 key를 get() 메소드의 인수로 넘기면 null이 리턴된다.
		System.out.println(hmap.get("banannaa"));
		//remove(key)메소드는 HashMap에 저장된 데이터 중에서 Key에 해당하는 데이터를 제거한다.
		hmap.remove("banana");
		System.out.println(hmap.size() + " :" + hmap);
		
		
		//clear() 메소드는 HashMap에 저장된 모든 데이터를 제거한다. 
		hmap.clear();
		System.out.println(hmap.size() + " :" + hmap);
		
		
		
		
		
		
		
		
		
>>>>>>> 534c0eb8033fb390e68c12295e4a83e4f95b604b
		
		
		
		
	}
}
