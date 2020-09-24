package com.jin.roo2.service.api;
import com.jin.roo2.domain.MenuSectionFood;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = MenuSectionFoodService
 *
 * TODO Auto-generated class documentation
 *
 */
@RooService(entity = MenuSectionFood.class)
public interface MenuSectionFoodService extends EntityResolver<MenuSectionFood, Long>, ValidatorService<MenuSectionFood> {
}
