package com.kyncu.beersystem.services.order;

import com.kyncu.beersystem.brewery.model.BeerOrderDto;
import com.kyncu.beersystem.repository.BeerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@RequiredArgsConstructor
@Component
public class BeerOrderValidator {

    private final BeerRepository beerRepository;

    public Boolean validateOrder(BeerOrderDto beerOrder) {
        AtomicInteger beerNotFound = new AtomicInteger();

        beerOrder.getBeerOrderLines().forEach( orderLine -> {
            if (!beerRepository.findByUpc(orderLine.getUpc()).isPresent()) {
                beerNotFound.incrementAndGet();
            }
        });
        return beerNotFound.get() == 0;
    }
}
