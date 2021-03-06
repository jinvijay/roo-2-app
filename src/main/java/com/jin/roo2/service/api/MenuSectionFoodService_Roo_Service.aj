// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.jin.roo2.service.api;

import com.jin.roo2.domain.Food;
import com.jin.roo2.domain.MenuSection;
import com.jin.roo2.domain.MenuSectionFood;
import com.jin.roo2.service.api.MenuSectionFoodService;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect MenuSectionFoodService_Roo_Service {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return MenuSectionFood
     */
    public abstract MenuSectionFood MenuSectionFoodService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param menuSectionFood
     */
    public abstract void MenuSectionFoodService.delete(MenuSectionFood menuSectionFood);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<MenuSectionFood> MenuSectionFoodService.save(Iterable<MenuSectionFood> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void MenuSectionFoodService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return MenuSectionFood
     */
    public abstract MenuSectionFood MenuSectionFoodService.save(MenuSectionFood entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return MenuSectionFood
     */
    public abstract MenuSectionFood MenuSectionFoodService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<MenuSectionFood> MenuSectionFoodService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<MenuSectionFood> MenuSectionFoodService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long MenuSectionFoodService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<MenuSectionFood> MenuSectionFoodService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<MenuSectionFood> MenuSectionFoodService.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param food
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<MenuSectionFood> MenuSectionFoodService.findByFood(Food food, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param menuSection
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<MenuSectionFood> MenuSectionFoodService.findByMenuSection(MenuSection menuSection, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param food
     * @return Long
     */
    public abstract long MenuSectionFoodService.countByFood(Food food);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param menuSection
     * @return Long
     */
    public abstract long MenuSectionFoodService.countByMenuSection(MenuSection menuSection);
    
}
