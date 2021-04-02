package com.company.hometask_22.annotation_task;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Fiat", 1970, "red", 257000));
        cars.add(new Car("Mercedes", 1949, "black", 369500));
        cars.add(new Car("Toyota", 2006, "black", 199000));
        cars.add(new Car("Nissan", 2013, "white", 50000));
        cars.add(new Car("Honda", 2000, "blue", 300000));

        String currentDir = System.getProperty("user.dir");
        writeAnnotated(cars, currentDir+"\\src\\com\\company\\hometask_22\\annotation_task\\carsOut.txt");

    }

    public static void writeAnnotated (List<Car> cars, String path){
        Class carClass = Car.class;
        Field[] fields = carClass.getDeclaredFields();
        try (Writer writer = new FileWriter(path)){
        for (Field field : fields){
            if (field.isAnnotationPresent(MyAnnotation.class)){
                field.setAccessible(true);
                writer.write((field.getName()+": "));;
                for (Car car : cars){
                    writer.write(field.get(car)+" ");
                }
                writer.write("\r\n");
            }
        }
        writer.flush();
    } catch (IOException | IllegalAccessException e){
            System.out.println(e.getMessage());
        }
    }
}
