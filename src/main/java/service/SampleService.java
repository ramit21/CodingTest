package service;

import model.SampleModel;

public class SampleService {

    public SampleModel getMessage() {
        return SampleModel.builder().message("Hello World").build();
    }

    public int squarePositiveNumber(int number) {
        if(number < 0){
            throw new IllegalArgumentException("Invalid value for number");
        }
        return number*number;
    }
}
