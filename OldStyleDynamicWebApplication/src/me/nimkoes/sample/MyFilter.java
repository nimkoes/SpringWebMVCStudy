package me.nimkoes.sample;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("MyFilter destroy !!!");
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		System.out.println("MyFilter destroy !!!");
		// filter 는 반드시 다음 Filter 를 호출하도록 해야 Servlet 호출이 가능하다.
		// 아래 코드를 작성하지 않으면 다음 Filter 또는 Servlet 을 호출하지 못한다.
		filterChain.doFilter(servletRequest, servletResponse);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("MyFilter init !!!");
	}

}
