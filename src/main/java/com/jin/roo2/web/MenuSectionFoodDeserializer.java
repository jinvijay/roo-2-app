package com.jin.roo2.web;
import com.jin.roo2.domain.MenuSectionFood;
import com.jin.roo2.service.api.MenuSectionFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = MenuSectionFoodDeserializer
 *
 * TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = MenuSectionFood.class)
public class MenuSectionFoodDeserializer extends JsonObjectDeserializer<MenuSectionFood> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MenuSectionFoodService menuSectionFoodService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param menuSectionFoodService
     * @param conversionService
     */
    @Autowired
    public MenuSectionFoodDeserializer(@Lazy MenuSectionFoodService menuSectionFoodService, ConversionService conversionService) {
        this.menuSectionFoodService = menuSectionFoodService;
        this.conversionService = conversionService;
    }
}
