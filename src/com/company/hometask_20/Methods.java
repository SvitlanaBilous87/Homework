package com.company.hometask_20;

import java.io.*;

public class Methods {

    public static <K> void serialize(K object, String path){
        try (OutputStream fileOutputStream = new FileOutputStream(path);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            objectOutputStream.writeObject(object);

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static Object deserialize(String path){
        Object newObject = new Object();

        try (InputStream fileInputStream = new FileInputStream(path);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
            newObject = objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        return newObject;
    }
}
