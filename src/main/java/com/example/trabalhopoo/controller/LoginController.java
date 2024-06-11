package com.example.trabalhopoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Controlador responsável por gerenciar as páginas de login e redirecionamento pós-login.
 */
@Controller
public class LoginController {

    /**
     * Mapeia a requisição GET para o endpoint "/login" e retorna o nome do template da página de login.
     *
     * @return o nome do arquivo HTML da página de login.
     */
    @GetMapping("/login")
    public String showLoginPage() {
        return "Login/index";
    }

    /**
     * Mapeia a requisição GET para o endpoint "/default" e redireciona o usuário para a página apropriada
     * com base em sua função (ROLE).
     *
     * @return a URL de redirecionamento após o login.
     * @throws IllegalStateException se o usuário tiver um papel desconhecido.
     */
    @GetMapping("/default")
    public String defaultAfterLogin() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication.getAuthorities().contains(new SimpleGrantedAuthority("ROLE_ADMIN"))) {
            return "redirect:/admin";
        } else if (authentication.getAuthorities().contains(new SimpleGrantedAuthority("ROLE_USER"))) {
            return "redirect:/usuario";
        } else {
            throw new IllegalStateException("Unknown role");
        }
    }
}

