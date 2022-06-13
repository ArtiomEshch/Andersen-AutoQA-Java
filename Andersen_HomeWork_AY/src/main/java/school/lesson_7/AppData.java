package school.lesson_7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    // getData генерирует String для записи в файл
    public static String generateData(AppData data) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < data.header.length; i++) {
            builder.append(data.header[i]);
            if (i != data.header.length - 1) {
                builder.append(';');
            } else {
                builder.append('\n');
            }
        }
        for (int i = 0; i < data.data.length; i++) {
            for (int j = 0; j < data.data[i].length; j++) {
                builder.append(data.data[i][j]);
                if (j < data.data[i].length - 1) {
                    builder.append(';');
                }
            }
            builder.append('\n');
        }
        return new String(builder);
    }

    public static void save(AppData data) throws IOException {
        BufferedWriter csvWriter = new BufferedWriter(new FileWriter("HW.csv"));
        csvWriter.write(generateData(data));
        csvWriter.close();
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppData appData = (AppData) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(header, appData.header)) return false;
        return Arrays.deepEquals(data, appData.data);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(header);
        result = 31 * result + Arrays.deepHashCode(data);
        return result;
    }

    @Override
    public String toString() {
        return "AppData{" +
                "header=" + Arrays.toString(header) +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
