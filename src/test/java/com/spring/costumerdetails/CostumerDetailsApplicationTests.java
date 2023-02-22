package com.spring.costumerdetails;


import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@DataJpaTest
class CostumerDetailsApplicationTests {

    @Autowired
    TestEntityManager entityManager;

    @Test
    public void givenACorrectSetup_thenAnEntityManagerWillBeAvailable() {
       // assertNotNull(entityManager);
    }
	
	
	@Test
	void contextLoads() {
	}

}
