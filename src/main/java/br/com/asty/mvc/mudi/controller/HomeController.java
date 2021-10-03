package br.com.asty.mvc.mudi.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.asty.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

    @PersistenceContext
    private EntityManager em;

    @GetMapping("/home")
    public String home(Model model) {

        Query query = em.createQuery("select p from Pedido p", Pedido.class);
        List<Pedido> pedidos = query.getResultList();
        
        model.addAttribute("pedidos", pedidos);

        return "home";
    }
}
