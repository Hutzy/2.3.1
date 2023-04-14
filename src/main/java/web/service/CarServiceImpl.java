package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = Arrays.asList(
            new Car("car1", "color1", 1900),
            new Car("car2", "color2", 1901),
            new Car("car3", "color3", 1902),
            new Car("car4", "color4", 1903),
            new Car("car5", "color5", 1904)
    );

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, count);
    }
}