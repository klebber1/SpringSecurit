package com.example.trabalhopoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controlador responsável por gerenciar as páginas do usuário.
 */
@Controller
public class UserController {

    /**
     * Mapeia a requisição GET para o endpoint "/usuario" e retorna o nome do template da página do usuário.
     *
     * @return o nome do arquivo HTML da página do usuário.
     */
    @GetMapping("/usuario")
    public String showUserPage() {
        return "Usuario/usuario"; // Nome do arquivo user.html
    }
}
