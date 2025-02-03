package Default;
import java.util.*;

public class Collection07_SortTest {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("Smith");
		names.add("Lee");
		names.add("Kim");
		names.add("Beckham");
		names.add("Schmidt");
		
		// 자체적인 비교 기준이 있기 때문에, 정렬이 가능하다.
		// 순서를 가지지 않는 것은 객체의 개본 정렬 기준을 정의해야 한다.
		Collections.sort(names);
		System.out.println(names);

		int[] nums = {5, 6, 1, 23, 4};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		
		
	}
}
