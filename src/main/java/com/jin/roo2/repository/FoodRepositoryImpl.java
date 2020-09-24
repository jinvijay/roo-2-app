package com.jin.roo2.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.jin.roo2.domain.Food;

/**
 * = FoodRepositoryImpl
 *
 * Implementation of FoodRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = FoodRepositoryCustom.class)
public class FoodRepositoryImpl extends QueryDslRepositorySupportExt<Food> implements FoodRepositoryCustom{

    /**
     * Default constructor
     */
    FoodRepositoryImpl() {
        super(Food.class);
    }
}