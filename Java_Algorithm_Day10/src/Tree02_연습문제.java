import java.util.*;

public class Tree02_연습문제 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(input);
		
		//노드의 총 개수
		int V = sc.nextInt();
		
		int[][] tree = new int[V+1][3];
		
		for(int i=0; i<V-1; i++) {
			int p = sc.nextInt();
			int c = sc.nextInt();
			// 문제에서 부모의 노드 번호가 작은것 부터 준다.
			// 왼쪽 자식부터 출력한다.
			
			if(tree[p][0] == 0) {
				tree[p][0] = c;
			}else {
				tree[p][1] = c;
			}
			
			// 부모정보 저장
			tree[c][2] = p;
		}
		
		for(int i=0; i<V+1; i++) {
			System.out.println(i+" : " + Arrays.toString(tree[i]));
		}
	}
	
	static String input = "13 \r\n" + "1 2 1 3 2 4 3 5 3 6 4 7 5 8 5 9 6 10 6 11 7 12 11 13";
	
}
