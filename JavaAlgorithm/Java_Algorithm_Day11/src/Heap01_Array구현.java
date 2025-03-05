import java.util.Arrays;

public class Heap01_Array구현 {
	static int[] heap;
	static int heapSize;
	
	public static void main(String[] args) {
		//문제
		heap = new int[100];
		heapSize = 0;
		
		heapPush(10);
		System.out.println(Arrays.toString(heap));
		heapPush(20);
		System.out.println(Arrays.toString(heap));
		heapPush(15);
		System.out.println(Arrays.toString(heap));
		heapPush(19);
		System.out.println(Arrays.toString(heap));
		
		System.out.println(heapPop());
		System.out.println(heapPop());
		System.out.println(heapPop());
		System.out.println(heapPop());

	}
	
	// 힙 자료형에 맞게 아이템을 삽입한다.
	public static void heapPush(int item) {
//		heapSize+=1;
//		heap[heapSize] = item;
		
		// 힙의 마지막 자리에 아이템을 삽입한다.
		heap[++heapSize] = item;
		
		int ch = heapSize;
		int p = ch/2;
		
		// 자식 노드가 더 클 때 부모와 자리를 바꿔준다.
		while(p > 0 && heap[p]<heap[ch]) {
			int tmp = heap[p];
			heap[p] = heap[ch];
			heap[ch] = tmp;
			
			ch = p;
			p = ch/2;
			
		}
	}
	
	public static int heapPop(){
		if(heapSize ==0) {
			return -1;
		}
		
		int item = heap[1];//루트 노드의 값을 저장해 놓는다.
		//가장 작은 숫자를 힙의 루트 노드에 넣는다.
//		heap[1] = heap[heapSize];
//		heapSize -=1;
		
		heap[1] = heap[heapSize--];
		int p = 1;
		int ch = p * 2; // 왼쪽 자식 값 저장
		if(ch+1<= heapSize && heap[ch]<heap[ch+1]) {
			ch+=1;
		}
		// 자식의 값이 더 클 경우, 부모와 자식의 값을 바꿔준다.
		while(ch <=heapSize && heap[p] < heap[ch]) {
			int tmp = heap[p];
			heap[p] = heap[ch];
			heap[ch] = tmp;
			
			p = ch;
			ch = p * 2;
			if(ch+1<=heapSize && heap[ch]<heap[ch+1]) {
				ch+=1;
			}
			
		}
		
		return item;
		
		
		
	}	
	
	
}
