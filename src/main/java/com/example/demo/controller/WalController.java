package com.example.demo.controller;

import com.example.demo.service.WalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wal")
public class WalController {

    @Autowired
    private WalService walService;

    @RequestMapping(method = RequestMethod.POST)
    public void create() {
        walService.create();
    }

    @RequestMapping(value = "/{amount}", method = RequestMethod.PUT)
    public void add(@PathVariable Integer amount) {
        walService.add(amount);
    }
}
