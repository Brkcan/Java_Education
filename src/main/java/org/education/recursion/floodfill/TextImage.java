package org.education.recursion.floodfill;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class TextImage {

    private char [][] m_image;

    public TextImage(int row, int col)
    {
        m_image = new char[row][col];
    }

    public int getRow()
    {
        return m_image.length;
    }

    public int getCol()
    {
        return m_image[0].length;
    }

    public char getChar(int i, int k)
    {
        return m_image[i][k];
    }

    public void setChar(int i, int k, char c)
    {
        m_image[i][k] = c;
    }

    public void loadBitmap(String path)
    {
        for (char[] array : m_image)
            Arrays.fill(array, ' ');

        fillBitmap(path);
    }

    public void saveImage(String path)
    {
        try (var bw =  Files.newBufferedWriter(Path.of(path) , StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
            bw.write(this.toString() + "\r\n");
            bw.flush();
        }
         catch (Throwable ex) {
             System.err.println("Save not exist" + ex.getMessage());
         }
    }

    public void fillBitmap(String path)
    {
        int row = 0;

        try (var br = Files.newBufferedReader(Path.of(path))) {
            String line;

            while((line = br.readLine()) != null) {
                int len = line.length();

                if(line.charAt(len - 1) == '\r')
                    line = line.substring(0, len - 1);

                for (int i = 0; i < len; ++i)
                    m_image[row][i] = line.charAt(i);
                ++row;

            }
        }
        catch (Throwable ex) {
            System.err.println("Exception occured" + ex.getMessage());
        }
    }

    public void floodFill(int i, int k, char c, char bound)
    {
        floodFill(m_image, i, k , c, bound);
    }

    private void floodFill(char [][] image, int i, int k, char c, char bound)
    {
        if(image[i][k] == c || image[i][k] == bound)
            return;

        image[i][k] = c;
        floodFill(image, i + 1, k, c, bound);
        floodFill(image, i, k + 1, c, bound);
        floodFill(image, i - 1, k, c, bound);
        floodFill(image, i, k - 1, c, bound);
    }

    @Override
    public String toString()
    {
        var sb = new StringBuilder();

        for (char[] chars : m_image) {
            for (char c : chars)
                sb.append(c);

            sb.append('\n');
        }
        return sb.toString();
    }
}
