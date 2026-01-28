package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger logger =
            LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        try {
            Calculator calc = new Calculator();
            logger.info("Calculation result: {}",
                    calc.calculate(10, 5, Operation.ADD));

            UserService service = new UserService();
            service.findUser("admin");
            service.deleteUser("admin");

        } catch (UserServiceException e) {
            logger.error("Application error occurred", e);
        }
    }
}
