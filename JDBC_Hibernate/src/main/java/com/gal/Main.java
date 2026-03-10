package com.gal;

import jakarta.persistence.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("supplyPU");

        EntityManager em = emf.createEntityManager();

        // 1. All supplier names
        List<String> suppliers =
                em.createQuery("select s.sname from Supplier s", String.class)
                        .getResultList();

        suppliers.forEach(s -> System.out.println(s));


        // 2. Suppliers from Delhi
        List<?> delhiSuppliers =
                em.createQuery("from Supplier s where s.city='Delhi'")
                        .getResultList();

        delhiSuppliers.forEach(s -> System.out.println(s));


        // 3. Items supplied by supplier with sid = 1
        List<String> items =
                em.createQuery(
                                "select sp.item.name from Supply sp where sp.supplier.sid=1",
                                String.class)
                        .getResultList();

        items.forEach(s -> System.out.println(s));

        em.close();
        emf.close();
    }
}
