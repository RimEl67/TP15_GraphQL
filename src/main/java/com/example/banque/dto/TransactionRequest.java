package com.example.banque.dto;

import com.example.banque.entities.TypeTransaction;
import lombok.Data;

@Data
public class TransactionRequest {
    private Long compteId;
    private double montant;
    private String date;
    private TypeTransaction type;
}