package ru.skillfactorydemo.tgbot.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import ru.skillfactorydemo.tgbot.entity.Income;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class IncomeRepositoryTest {

    @Autowired
    private IncomeRepository repository;

    @Test
    public void testDataScipst(){
        Optional<Income> income = repository.findById(54321L);
        assertTrue(income.isPresent());
        assertEquals(new BigDecimal("3000.00"),income.get().getIncome());
    }
}
