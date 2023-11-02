package com.kyncu.beersystem.common.events;

import com.kyncu.beersystem.web.model.BeerDto;
import lombok.*;

import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BeerEvent implements Serializable {
    static final long serialVersionUID = 594412047893665730L;

    private BeerDto beerDto;
}
