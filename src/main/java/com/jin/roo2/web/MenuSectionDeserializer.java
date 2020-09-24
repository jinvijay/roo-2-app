package com.jin.roo2.web;
import com.jin.roo2.domain.MenuSection;
import com.jin.roo2.service.api.MenuSectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = MenuSectionDeserializer
 *
 * TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = MenuSection.class)
public class MenuSectionDeserializer extends JsonObjectDeserializer<MenuSection> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MenuSectionService menuSectionService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param menuSectionService
     * @param conversionService
     */
    @Autowired
    public MenuSectionDeserializer(@Lazy MenuSectionService menuSectionService, ConversionService conversionService) {
        this.menuSectionService = menuSectionService;
        this.conversionService = conversionService;
    }
}
