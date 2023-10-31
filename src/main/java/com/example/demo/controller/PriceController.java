package com.example.demo.controller;
import com.example.demo.entity.Price;
import com.example.demo.service.PriceService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping
public class PriceController {

    @Resource
    PriceService priceService;


     @GetMapping("prices")
    public Price getPrice(@ModelAttribute Price price) {

        return priceService.getPriceData(price);
      }

}