// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.jin.roo2.web;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jin.roo2.domain.MenuSectionFood;
import com.jin.roo2.web.MenuSectionJsonMixin;
import java.util.Set;

privileged aspect MenuSectionJsonMixin_Roo_JSONMixin {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<MenuSectionFood> MenuSectionJsonMixin.menuSectionFood;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<MenuSectionFood> MenuSectionJsonMixin.getMenuSectionFood() {
        return menuSectionFood;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param menuSectionFood
     */
    public void MenuSectionJsonMixin.setMenuSectionFood(Set<MenuSectionFood> menuSectionFood) {
        this.menuSectionFood = menuSectionFood;
    }
    
}