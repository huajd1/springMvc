package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> carList;

    public CarDaoImpl() {
        this.carList = new ArrayList<>(Arrays.asList(
                new Car("Toyota", "Camry", 2015),
                new Car("Honda", "Accord", 2016),
                new Car("Ford", "Mustang", 2020),
                new Car("Chevrolet", "Corvette", 2021),
                new Car("Tesla", "Model S", 2022)
        ));
    }

    @Override
    public List<Car> getCars() {
        return carList;
    }

    @Override
    public void addCar(Car car) {
        carList.add(car);
    }
}