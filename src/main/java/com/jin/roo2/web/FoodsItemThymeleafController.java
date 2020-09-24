package com.jin.roo2.web;
import com.jin.roo2.domain.Food;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = FoodsItemThymeleafController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Food.class, type = ControllerType.ITEM)
@RooThymeleaf
public class FoodsItemThymeleafController implements ConcurrencyManager<Food> {
}
