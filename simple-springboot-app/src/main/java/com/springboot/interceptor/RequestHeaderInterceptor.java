package com.springboot.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class RequestHeaderInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		// Uncomment to use the interceptor with a request header
		if (request.getHeader("student-auth-key") == null || request.getHeader("student-auth-key").isEmpty()) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid request: Missing student-auth-key");
			return false; // Return false to prevent further handling of the request
		}

		return true; // Continue with the request handling
	}
}
