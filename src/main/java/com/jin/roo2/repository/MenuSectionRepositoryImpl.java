package com.jin.roo2.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.jin.roo2.domain.MenuSection;

/**
 * = MenuSectionRepositoryImpl
 *
 * Implementation of MenuSectionRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = MenuSectionRepositoryCustom.class)
public class MenuSectionRepositoryImpl extends QueryDslRepositorySupportExt<MenuSection> implements MenuSectionRepositoryCustom{

    /**
     * Default constructor
     */
    MenuSectionRepositoryImpl() {
        super(MenuSection.class);
    }
}