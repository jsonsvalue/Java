
public class Array08_2차원배열순회 {
	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		
		// 행을 순회한다.
//		for(int i=0; i<arr.length; i++) {
//			// 열을 순회한다.
////			for(int j=arr[i].length-1; j>=0; j--) {
////				System.out.print(arr[i][j] + " ");
////			}
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][arr[i].length-1-j] + " ");
//			}
//			System.out.println();
//		}
//	
//		// 열을 고정하고 행을 순회한다.(가변 배열일 때 순회하는 방법을 고민해보자)
//		for(int j=0; j<arr[0].length ; j++) {
//			for(int i=0; i<arr.length; i++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				if(i%2==0) {
					System.out.print(arr[i][j]+ " ");
				}
				else {
					System.out.print(arr[i][arr[i].length-1- j] + " ");
				}
			}
			System.out.println();
		}
		
		
	}
}
