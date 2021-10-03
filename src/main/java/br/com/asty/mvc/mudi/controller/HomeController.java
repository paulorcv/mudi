package br.com.asty.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.asty.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {

        Pedido pedido = new Pedido();
        pedido.setNome("Novo Kindle Paperwhite");
        pedido.setDescricao(
                "O Kindle Paperwhite é fino, leve e fácil de transportar para que você possa aproveitar seus livros favoritos a qualquer momento. Apresenta nossa característica tela antirreflexo de 300 ppi, agora com 10% mais brilho em sua configuração máxima, para que você possa ler em qualquer luz. E agora, uma única recarga de bateria via USB-C dura até 10 semanas. A duração da bateria pode variar dependendo do uso.");
        pedido.setUrlProduto("https://www.amazon.com.br/Kindle-Paperwhite-8GB/dp/B08N3J8GTX/ref=sr_1_3?__mk_pt_BR=ÅMÅŽÕÑ&dchild=1&keywords=kindle&qid=1633256387&sr=8-3");
        pedido.setUrlImagem("https://m.media-amazon.com/images/I/71Vv2AIwg+L._AC_SL1500_.jpg");

        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedidos);

        return "home";
    }
}
