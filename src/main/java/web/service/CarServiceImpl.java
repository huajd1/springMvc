package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> carList;

    public CarServiceImpl() {
        this.carList = Arrays.asList(
                new Car("Toyota", "Camry", 2015),
                new Car("Honda", "Accord", 2016),
                new Car("Ford", "Mustang", 2020),
                new Car("Chevrolet", "Corvette", 2021),
                new Car("Tesla", "Model S", 2022)
        );
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= carList.size()) {
            return carList;
        }
        return carList.subList(0, count);
    }
}