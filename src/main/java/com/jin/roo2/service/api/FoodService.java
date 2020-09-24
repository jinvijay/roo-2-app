package com.jin.roo2.service.api;
import com.jin.roo2.domain.Food;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = FoodService
 *
 * TODO Auto-generated class documentation
 *
 */
@RooService(entity = Food.class)
public interface FoodService extends EntityResolver<Food, Long>, ValidatorService<Food> {
}
