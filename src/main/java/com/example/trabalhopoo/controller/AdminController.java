package com.example.trabalhopoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controlador responsável por gerenciar as páginas de administração.
 */
@Controller
public class AdminController {

    /**
     * Mapeia a requisição GET para o endpoint "/admin" e retorna o nome do template da página de administração.
     *
     * @return o nome do arquivo HTML da página de administração.
     */
    @GetMapping("/admin")
    public String showAdminPage() {
        return "Admin/adm"; // Nome do arquivo admin.html
    }
}