package com.kyncu.msbeerservice.events;

import com.kyncu.msbeerservice.web.model.BeerDto;
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
