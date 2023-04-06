package ch.swg.budgetplanner.server.persistence.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import ch.swg.budgetplanner.server.persistence.movement.Movement;
import ch.swg.budgetplanner.server.persistence.movement.MovementRepository;

@Configuration
class LoadDummyData {

  private static final Logger LOG = LoggerFactory.getLogger(LoadDummyData.class);

  @Bean
  @Order(10)
  CommandLineRunner initDummyMovements(MovementRepository repository) {
    return args -> {
      LOG.info("Delete old dummy data for money movements.");
      repository.deleteAll();
      LOG.info("Load dummy money movements.");
      repository.save(new Movement("Initial state", 9000, false));
      repository.save(new Movement("Mobile payment", 4500, true));
    };
  }
}
