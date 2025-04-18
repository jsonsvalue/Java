package com.ssafy.board.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConfig {
	private static SqlSessionFactory factory;
	
	/*
	 * public MyBatisConfig() { }
	 */
	
	static {
		// myBatisConfig 파일에 있는 설정값을 기반으로, factory를 만든다.
		// DAO를 구현하고 DB에 있는 SQL구문을 통해 데이터를 저장할 수 있는 객체를 형성한다.
		String resource = "mybatis-config.xml";
		try(InputStream inputStream = Resources.getResourceAsStream(resource)){
			factory = new SqlSessionFactoryBuilder().build(inputStream);
			System.out.println("공장 건설 완료");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("공장 건설 실패");
			//e.printStackTrace();
		}
		
	}
	
	public static SqlSessionFactory getFactory() {
		return factory;
	}
	
	
	
}
