package com.cognizant.springlearn.filter;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;


public class JwtAuthorizationFilter extends OncePerRequestFilter {

    @Override
protected void doFilterInternal(HttpServletRequest request,
                                HttpServletResponse response,
                                FilterChain filterChain)
        throws ServletException, IOException {

    String header = request.getHeader("Authorization");

    if (header != null && header.startsWith("Bearer ")) {

        String token = header.substring(7);

        try {

            Claims claims = Jwts.parser()
                    .setSigningKey("secretkey")
                    .parseClaimsJws(token)
                    .getBody();

            String user = claims.getSubject();

            UsernamePasswordAuthenticationToken authentication =
                    new UsernamePasswordAuthenticationToken(
                            user,
                            null,
                            AuthorityUtils.createAuthorityList("ROLE_USER"));

            SecurityContextHolder.getContext().setAuthentication(authentication);

        } catch (Exception e) {

            System.out.println("Invalid JWT Token");

        }
    }

    filterChain.doFilter(request, response);
}
}