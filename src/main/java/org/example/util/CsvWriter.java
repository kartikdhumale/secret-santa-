package org.example.util;

import org.example.model.Assignment;
import java.io.*;
import java.util.List;

public class CsvWriter {

    public void write(String path, List<Assignment> list) throws Exception {

        BufferedWriter bw = new BufferedWriter(new FileWriter(path));

        bw.write("Employee_Name,Employee_EmailID,Secret_Child_Name,Secret_Child_EmailID\n");

        for (Assignment a : list) {
            bw.write(a.getGiver().getName() + "," +
                    a.getGiver().getEmail() + "," +
                    a.getReceiver().getName() + "," +
                    a.getReceiver().getEmail() + "\n");
        }

        bw.close();
    }
}