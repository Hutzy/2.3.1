package web.service;

import web.model.Car;

import java.util.List;

public interface CarServiceImpl {
    public List<Car> getCars(int count);
}

//не до конца понял как это работает