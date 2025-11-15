package com.example.banque.repositories;

import com.example.banque.entities.Compte;
import com.example.banque.entities.Transaction;
import com.example.banque.entities.TypeTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByCompte(Compte compte);

    @Query("SELECT COALESCE(SUM(t.montant), 0) FROM Transaction t WHERE t.type = :type")
    Double sumByType(@Param("type") TypeTransaction type);

    @Query("SELECT COALESCE(SUM(t.montant), 0) FROM Transaction t WHERE t.compte = :compte AND t.type = :type")
    Double sumByCompteAndType(@Param("compte") Compte compte, @Param("type") TypeTransaction type);
}