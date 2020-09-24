package com.jin.roo2.web;
import com.jin.roo2.domain.Food;
import com.jin.roo2.service.api.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = FoodDeserializer
 *
 * TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Food.class)
public class FoodDeserializer extends JsonObjectDeserializer<Food> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private FoodService foodService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param foodService
     * @param conversionService
     */
    @Autowired
    public FoodDeserializer(@Lazy FoodService foodService, ConversionService conversionService) {
        this.foodService = foodService;
        this.conversionService = conversionService;
    }
}
