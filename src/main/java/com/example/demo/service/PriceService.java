package com.example.demo.service;
import com.example.demo.entity.Price;
import com.example.demo.repository.PriceRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PriceService {

    @Resource
    PriceRepository priceRepository;

     public  Price  getPriceData( Price price) {

        return
         priceRepository.findPriceForProductAndBrand(
                 price.getBrandId(),price.getProductId(),price.getStartDate())
          .stream().findFirst()
                 .orElseThrow(RuntimeException::new)
                ;

    }

}
