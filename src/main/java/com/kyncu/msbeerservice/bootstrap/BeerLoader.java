package com.kyncu.msbeerservice.bootstrap;

import com.kyncu.msbeerservice.domain.Beer;
import com.kyncu.msbeerservice.repository.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                    .beerName("Mango Bobs")
                    .beerStyle("IPA")
                    .quantityBrew(200)
                    .minOnHand(12)
                    .upc(337010000001L)
                    .price(BigDecimal.valueOf(12.95))
                    .build());
            beerRepository.save(Beer.builder()
                    .beerName("Galaxy Cat")
                    .beerStyle("PALE_ALE")
                    .quantityBrew(200)
                    .minOnHand(12)
                    .upc(337010000002L)
                    .price(BigDecimal.valueOf(11.95))
                    .build());
        }

        System.out.println("Loaded Beers: " + beerRepository.count());
    }
}
