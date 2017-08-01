package com.example.demo.service;

import com.example.demo.domain.Wal;
import com.example.demo.domain.WalRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WalService {

    @Autowired
    private WalRep walRep;

    @Transactional
    public void create() {
        Wal wal = new Wal();
        walRep.save(wal);
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void add (int amount) {
        Wal wal = walRep.getOne(1L);
        wal.setAmount(wal.getAmount() + amount);

        walRep.save(wal);
    }
}
