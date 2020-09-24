package com.jin.roo2.web;
import com.jin.roo2.domain.Food;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = FoodsCollectionThymeleafController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Food.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class FoodsCollectionThymeleafController {
}
