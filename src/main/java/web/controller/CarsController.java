package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarsController {
    @Autowired
    private CarService carService;
    private List<Car> cars = Arrays.asList(new Car[] {
            new Car("ferarri", 1, 2),
            new Car("samurai", 2, 3),
            new Car("samurai", 3, 4),
            new Car("samurai", 4, 5),
            new Car("samurai", 5, 6)}
    );

    @GetMapping(value = "/cars")
    public String cars(ModelMap model, @RequestParam(defaultValue = "-1", required = false) int count) {
        int limit = count == -1 || count > 5? cars.size() : count;
        model.addAttribute("cars", carService.getAllCars(cars, limit));
        return "cars";
    }
}