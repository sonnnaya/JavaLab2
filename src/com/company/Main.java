package com.company;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Person person1 = new Person("Test", "Person", 19);
        Gson gson = new Gson();
        String json = gson.toJson(person1);

        FileWriter writer = new FileWriter("person.json");
        writer.write(json);
        writer.close();

        File reader = new File("person.json");
        Scanner scan = new Scanner(reader);
        Person person2 = gson.fromJson(scan.nextLine(), Person.class);
        scan.close();

        System.out.println(person1.equals(person2));

    }
}