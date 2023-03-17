import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ReadFile extends Rumus {
    static ArrayList<String[]> data = new ArrayList<>();

    public ArrayList<ArrayList<String>> Read(String csvFile) {
        BufferedReader br = null;
        ArrayList<String> lines = new ArrayList<>();
        ArrayList<ArrayList<String>> data = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(csvFile));

            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }

            for (String row : lines) {
                String[] values = row.split(";");
                ArrayList<String> rowData = new ArrayList<>();
                Collections.addAll(rowData, values);
                data.add(rowData);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }

}