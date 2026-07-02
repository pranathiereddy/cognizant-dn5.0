package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.model.Stock;
import com.cognizant.ormlearn.model.StockPriceHistory;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.StockService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.cognizant.ormlearn.repository") // Forces tracking synchronization
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
        LOGGER.info("Inside main");
    }

    @Bean
    public CommandLineRunner demoRunner(CountryService countryService, StockService stockService) {
        return args -> {
            LOGGER.info("--- 🌍 Executing Country Search Filter ---");
            List<Country> countries = countryService.findCountriesMatching("it");
            for (Country c : countries) {
                LOGGER.info("Found Country: {}", c);
            }

            LOGGER.info("--- 📈 Executing Advanced Stock Mapping Check ---");
            List<Stock> stocks = stockService.getAllStocks();
            for (Stock s : stocks) {
                LOGGER.info("Retrieved Stock Model: {}", s);
                for (StockPriceHistory sph : s.getPriceHistoryList()) {
                    LOGGER.info("  -> Price History Event: Date: {}, Price: INR {}", sph.getDate(), sph.getPrice());
                }
            }
        };
    }
}