package com.kyncu.beersystem.services;

import com.kyncu.beersystem.services.inventory.BeerInventoryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Disabled // utility for manual testing
@SpringBootTest
class BeerInventoryServiceRestTemplateImplTest {

    @Autowired
    BeerInventoryService beerInventoryService;

    @BeforeEach
    void setUp() {

    }

    @Test
    void getOnhandInventory() {
        //TODO: Fix this
        //Integer qoh = beerInventoryService.getOnHandInventory(BeerLoader.BEER_1_UUID);

        //System.out.println(qoh);

    }
}