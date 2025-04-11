package com.ssafy.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// Maven프로젝트를 이용해서 Spring 프레임워크를 쓸 수 있고, 
		// 그것을 나의 코드 내에서 쓸 수 있는 것이다. 
		
		// 설정 파일을 이용하여 컨테이너를 들고온다.
		// 설정 파일에 대한 경로를 작성한다.
		
		// Container를 Build하는 시점에서 Desktop을 이미 만들고, 
		// getBean을 할 때 만든 것을 쓴다.
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		
		// System.out.println("1");
		Desktop desktop = (Desktop) context.getBean("desktop");
		Desktop desktop2 = (Desktop) context.getBean("desktop");
		
		Programmer p = context.getBean("programmer", Programmer.class);
		
		p.setComputer(desktop);
		p.coding();
		
		// System.out.println("2");
		
		
		// Desktop 객체를 2개 생성했는데도 같은 것으로 나오는 것보면, Singleton으로 관리되는 것을 알 수 있다.
		// System.out.println( desktop == desktop2 );
		
		
		
	}
}
