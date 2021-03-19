package com.company.hometask_17;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException,
            InstantiationException, NoSuchMethodException {
        Tyre tyre1 = new Tyre("Goodyear", "summer", 205, 55,
                16, 95.5);

        Class class1 = tyre1.getClass();

        Method[] methods = class1.getDeclaredMethods();
        System.out.println(Arrays.toString(methods));

        Field[] fields = class1.getDeclaredFields();
        System.out.println(Arrays.toString(fields));

        Constructor[] constructors = class1.getDeclaredConstructors();
        System.out.println(Arrays.toString(constructors));

        Tyre tyre2 = (Tyre) constructors[0].newInstance("Michelin", "winter", 195, 65, 15, 82.7);

        constructors[1].setAccessible(true);
        Tyre tyre3 = (Tyre) constructors[1].newInstance("Pirelli", 22, 175.9);

        System.out.println(tyre1);
        System.out.println(tyre2);
        System.out.println(tyre3);

        Method methodWithoutParams = class1.getMethod("totalHeightMm");
        methodWithoutParams.invoke(tyre1);

        Method methodWithParams = class1.getDeclaredMethod("pricePerSet", int.class);
        methodWithParams.setAccessible(true);
        System.out.println("Total price for the set of 4 Michelin tyres "+ methodWithParams.invoke(tyre2, 4)
                +" USD.");

    }
}
