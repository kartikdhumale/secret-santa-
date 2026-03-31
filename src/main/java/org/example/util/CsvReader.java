package org.example.util;

import org.example.model.Employee;
import java.io.*;
import java.util.*;

public class CsvReader {

    public List<Employee> readEmployees(String path) throws Exception {
        List<Employee> list = new ArrayList<>();

        InputStream is = getClass().getClassLoader().getResourceAsStream(path);

        if (is == null) {
            throw new RuntimeException("File not found: " + path);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line;
        br.readLine();

        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            list.add(new Employee(d[0], d[1]));
        }

        return list;
    }
    public Map<String, String> readLastYear(String path) throws Exception {
        Map<String, String> map = new HashMap<>();

        InputStream is = getClass().getClassLoader().getResourceAsStream(path);

        if (is == null) {
            throw new RuntimeException("File not found: " + path);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line;
        br.readLine();

        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            map.put(d[1], d[3]);
        }

        return map;
    }
}