package org.example.main;

import org.example.model.*;
import org.example.service.SecretSantaService;
import org.example.util.*;

import java.util.*;

public class MainApp {

    public static void main(String[] args) throws Exception {

        CsvReader reader = new CsvReader();
        CsvWriter writer = new CsvWriter();
        SecretSantaService service = new SecretSantaService();

        List<Employee> employees = reader.readEmployees("employees.csv");
        Map<String, String> lastYear = reader.readLastYear("last_year.csv");

        List<Assignment> result = service.generate(employees, lastYear);

        writer.write("output.csv", result);

        System.out.println("DONE ✅ Check output.csv");
    }
}