package org.example.service;

import org.example.model.*;
import java.util.*;

public class SecretSantaService {

    public List<Assignment> generate(List<Employee> employees,
                                     Map<String, String> lastYear) {

        List<Employee> receivers = new ArrayList<>(employees);
        List<Assignment> result = new ArrayList<>();

        boolean valid = false;

        while (!valid) {
            Collections.shuffle(receivers);
            result.clear();
            valid = true;

            for (int i = 0; i < employees.size(); i++) {
                Employee giver = employees.get(i);
                Employee receiver = receivers.get(i);

                if (giver.getEmail().equals(receiver.getEmail())) {
                    valid = false;
                    break;
                }

                if (lastYear.containsKey(giver.getEmail()) &&
                        lastYear.get(giver.getEmail()).equals(receiver.getEmail())) {
                    valid = false;
                    break;
                }

                result.add(new Assignment(giver, receiver));
            }
        }
        return result;
    }
}