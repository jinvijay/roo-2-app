// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.jin.roo2.web;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.jin.roo2.domain.Food;
import com.jin.roo2.domain.MenuSection;
import com.jin.roo2.web.FoodDeserializer;
import com.jin.roo2.web.MenuSectionDeserializer;
import com.jin.roo2.web.MenuSectionFoodJsonMixin;

privileged aspect MenuSectionFoodJsonMixin_Roo_JSONMixin {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = FoodDeserializer.class)
    private Food MenuSectionFoodJsonMixin.food;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = MenuSectionDeserializer.class)
    private MenuSection MenuSectionFoodJsonMixin.menuSection;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Food
     */
    public Food MenuSectionFoodJsonMixin.getFood() {
        return food;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param food
     */
    public void MenuSectionFoodJsonMixin.setFood(Food food) {
        this.food = food;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MenuSection
     */
    public MenuSection MenuSectionFoodJsonMixin.getMenuSection() {
        return menuSection;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param menuSection
     */
    public void MenuSectionFoodJsonMixin.setMenuSection(MenuSection menuSection) {
        this.menuSection = menuSection;
    }
    
}
