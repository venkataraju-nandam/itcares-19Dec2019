package com.org.app.poc.itcares;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.org.app.poc.itcares.bean.City;
import com.org.app.poc.itcares.repository.CityRepository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CityRepositoryIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CityRepository repository;

    @Test
    public void testFindByName() {

        entityManager.persist(new City("Bratislava", 432000));
        entityManager.persist(new City("Budapest", 1759000));
        entityManager.persist(new City("Prague", 1280000));
        entityManager.persist(new City("Warsaw", 1748000));

        List<City> cities = repository.findByName("Bratislava");
        assertEquals(1, cities.size());

        assertThat(cities).extracting(City::getName).containsOnly("Bratislava");
    }
}