package Default;

import java.util.*;

public class Collection01_ListTest {
	public static void main(String[] args) {
		// List -> 순서 O, 중복 O
		// ArrayList, Linked List, Vector(요즘은 잘 안쓴다.)
		
		//ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> names = new ArrayList<>();
		
		//원소 추가
		names.add("Lebron");
		names.add("Anthony");
		names.add("Anthony");
		names.add(0, "Austin");
		
		// 원소를 맨 앞에 추가 후, 다른 데이터를 뒤로 미룬다.
		System.out.println(names);
		
		//System.out.println(names.size());
		
//		names.clear();
//		names.isEmpty();
//		System.out.println(names);

		// 원소의 내용을 바꾸는 방법이다.
		names.set(0, "Doncici");
		System.out.println(names);
		
		for(int i=0; i<names.size(); i++) {
			if(names.get(i).contains("Anthony")) {
				names.remove("Anthony");
			}
		}
		
		//names.remove("Anthony");
		System.out.println(names);

		
		
	}

}
