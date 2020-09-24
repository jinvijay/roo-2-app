package com.jin.roo2.service.api;
import com.jin.roo2.domain.MenuSection;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = MenuSectionService
 *
 * TODO Auto-generated class documentation
 *
 */
@RooService(entity = MenuSection.class)
public interface MenuSectionService extends EntityResolver<MenuSection, Long>, ValidatorService<MenuSection> {
}
