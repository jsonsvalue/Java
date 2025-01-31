package generics01_normal_box;

// 어떠한 자료형이든 넣을 수 있는 박스
class Box{
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	
	
}
public class BoxTest {
	public static void main(String[] args) {
		Box box = new Box();
		box.setObj(1);
		
		box.setObj("문자열");
		System.out.println(box.getObj());
		
		if(box.getObj() instanceof Double){
			System.out.println("실수형 값입니다." + (Double)box.getObj());
		}else if(box.getObj() instanceof String ) {
			
		}
		
		
		
	}
}
