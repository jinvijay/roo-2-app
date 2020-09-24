package com.jin.roo2.web;
import com.jin.roo2.domain.MenuSection;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = MenuSectionsItemThymeleafController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = MenuSection.class, type = ControllerType.ITEM)
@RooThymeleaf
public class MenuSectionsItemThymeleafController implements ConcurrencyManager<MenuSection> {
}
