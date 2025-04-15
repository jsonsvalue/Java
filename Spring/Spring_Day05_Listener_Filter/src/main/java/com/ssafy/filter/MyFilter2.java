package com.ssafy.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;

// 특정한 Url 요청이 왔을 때만, Filter 요청을 실행한다는 뜻이다.
@WebFilter("/MyFilter")
public class MyFilter2 extends HttpFilter implements Filter {
    private FilterConfig fConfig;
	
    public MyFilter2() {
        super();
        
    }

	
	public void destroy() {
		
	}
	
	// 요청, 응답, 연속적인 Filter 처리
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Before Servlet2");
		// request.setCharacterEncoding("UTF-16");
		
		// Servlet으로 보내는 코드이다.
		// 모든 filter를 다 처리했다면, servlet으로 보낸다.
		chain.doFilter(request, response);
		
		System.out.println("After Servlet2");
	}

	// init 파라미터는 fconfig 변수에 들어간다.
	public void init(FilterConfig fConfig) throws ServletException {
		this.fConfig = fConfig;
	}

}
