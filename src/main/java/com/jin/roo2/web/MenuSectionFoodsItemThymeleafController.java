package com.jin.roo2.web;
import com.jin.roo2.domain.MenuSectionFood;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = MenuSectionFoodsItemThymeleafController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = MenuSectionFood.class, type = ControllerType.ITEM)
@RooThymeleaf
public class MenuSectionFoodsItemThymeleafController implements ConcurrencyManager<MenuSectionFood> {
}
