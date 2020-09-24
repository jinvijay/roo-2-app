package com.jin.roo2.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.jin.roo2.domain.MenuSectionFood;

/**
 * = MenuSectionFoodRepositoryImpl
 *
 * Implementation of MenuSectionFoodRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = MenuSectionFoodRepositoryCustom.class)
public class MenuSectionFoodRepositoryImpl extends QueryDslRepositorySupportExt<MenuSectionFood> implements MenuSectionFoodRepositoryCustom{

    /**
     * Default constructor
     */
    MenuSectionFoodRepositoryImpl() {
        super(MenuSectionFood.class);
    }
}