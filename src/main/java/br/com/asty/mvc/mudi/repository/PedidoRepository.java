package br.com.asty.mvc.mudi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.asty.mvc.mudi.model.Pedido;

@Repository
public class PedidoRepository {
    

    @PersistenceContext
    private EntityManager em;


    public List<Pedido> recuperaTodos(){
        Query query = em.createQuery("select p from Pedido p", Pedido.class);
        List<Pedido> pedidos = query.getResultList();
       return pedidos;
    }

}
