package com.ssafy.back.jwt;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.SecretKey;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

public class JwtTest {
	
	public static void main(String[] args) throws InterruptedException {
		String key = "SSAFY_NonMajor_JavaTrack_SecretKey";
		SecretKey secretKey = Keys.hmacShaKeyFor(key.getBytes(StandardCharsets.UTF_8));
		
		Map<String, String> headers = new HashMap<>();
		headers.put("type", "JWT");
		
		String token = Jwts.builder() // JWT를 만들 수 있는 Builder 객체
		.header() // Header를 만드는 객체로 변경됨
		.add("name", "Lee")
		.add(headers).and() // 다시 JWT Builder로 돌아온다.
		.subject("jwt class")
		.expiration(new Date(System.currentTimeMillis()+3000))
		.signWith(secretKey) // 서명 완료
		.compact();
		
		System.out.println(token);
		
		Thread.sleep(4000);
		// 토큰 발급함
		// 토큰에 대한 유효성 검증 필요
		
		Jws<Claims> jwsClaims = Jwts.parser().verifyWith(secretKey).build().parseSignedClaims(token);
		
		System.out.println(jwsClaims.getHeader());
		System.out.println(jwsClaims.getPayload());
		
		
		
	}
}
