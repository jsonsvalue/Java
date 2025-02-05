package Default;

import java.util.*;

public class Collection03_MapTest {
	public static void main(String[] args) {
		//Map : Key-Value 값으로 이뤄져 있다.
		// Key는 중복 X/ Value 는 중복 O/ 순서 X -> 일부 자료형은 순서가 있는 것들도 있다.
		
		// 내가 정의한 객체 자료형으로 자료형을 형성할 수도 있다.
		Map<String, String> map = new HashMap<>();
		
		map.put("이재석", "python");
		map.put("이종환", "Java");
		map.put("이솔빈", "Java");
		map.put("이솔빈", "C++");
		
		System.out.println(map);
	
		// Key 값을 모두 찾는다.
		System.out.println(map.keySet());
		System.out.println("---------------");
		
		// Key값을 활용하여 모든 Value 값을 찾는다.
		for(String key:map.keySet()) {
			System.out.println(map.get(key));
		}
		
		System.out.println("---------------");
		System.out.println(map.containsKey("이재석"));
		System.out.println(map.containsKey("희망봉"));
		
		
	}
}
