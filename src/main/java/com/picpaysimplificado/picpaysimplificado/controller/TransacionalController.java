package com.picpaysimplificado.picpaysimplificado.controller;


import com.picpaysimplificado.picpaysimplificado.doMain.transaction.Transaction;
import com.picpaysimplificado.picpaysimplificado.dtos.TransactionDTO;
import com.picpaysimplificado.picpaysimplificado.services.TransactionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
public class TransacionalController {

        @Autowired
        private TransactionService transactionService;


        @PostMapping
        public ResponseEntity<Transaction> createTransaction(@RequestBody @Valid TransactionDTO trasaction) throws Exception{
            Transaction newTransaction = transactionService.createTransaction(trasaction);

            return new ResponseEntity<>(newTransaction, HttpStatus.OK);
        }

}
