package br.com.alura.loja.testes;

import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class CadastroDeProduto {
    public static void main(String[] args) {
        var celular = new Produto("Xiaomi Redmi", "Muito legal",new BigDecimal("800"), Categoria.CELULARES);

        EntityManager em = JPAUtil.getEntityManeger();
        ProdutoDao dao = new ProdutoDao(em);

        em.getTransaction().begin();
        em.persist(celular);
        em.getTransaction().commit();
        em.close();
    }
}