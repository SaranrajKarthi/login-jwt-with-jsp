package com.saran.service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtService {
	
	public static final String SECRET = "8Ns5L8qvBbeIcAvF6zARokHy27SZdnq1";

//	 public String extractUsername(String token) {
//	        return extractClaim(token, Claims::getSubject);
//	    }
//
//	    public Date extractExpiration(String token) {
//	        return extractClaim(token, Claims::getExpiration);
//	    }
////
//	    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
//	        final Claims claims = extractAllClaims(token);
//	        return claimsResolver.apply(claims);
//	    }
//
//	    private Claims extractAllClaims(String token) {
//	        return Jwts
//	        		.builder()
//	                .setSigningKey(getSecretKey)
//	                .build()
//	                .parseClaimsJws(token)
//	                .getBody();
//	    }
//
//	    private Boolean isTokenExpired(String token) {
//	        return extractExpiration(token).before(new Date());
//	    }

	
	public String generateToken(String userName) {
		Map<String, Object> claims = new HashMap<>();
		return createToken(claims,userName);
	}

	private String createToken(Map<String, Object> claims, String userName) {
		// TODO Auto-generated method stub
		return Jwts.builder()
				.setClaims(claims)
				.setSubject(userName)
				.setIssuedAt(new Date(System.currentTimeMillis()))
//				.setExpiration(new Date(System.currentTimeMillis()+1000 * 60 * 30))
				.signWith(SignatureAlgorithm.HS256,SECRET).compact();
	}
//	 private Key getSignKey() {
//	        byte[] keyBytes= Decoders.BASE64.decode(SECRET);
//	        return Keys.hmacShaKeyFor(keyBytes);
//	    }

	
	

//	 public boolean isTokenValid(String token) {
//	        try {
//	            Jws<Claims> claimsJws = Jwts.builder()
//	                    .signWith(SignatureAlgorithm.HS256, SECRET)
//	                    
//	                    .parseClaimsJws(token);
//
//	            return !claimsJws.getBody().getExpiration().before(new Date());
//	        } catch (Exception e) {
//	            return false;
//	        }
//	    }
//
//	    public String extractUsernameFromToken(String token) {
//	        return Jwts.builder()
//	                .setSigningKey(getSecretKey())
//	                .build()
//	                .parseClaimsJws(token)
//	                .getBody()
//	                .getSubject();
//	    }
//	}

}
