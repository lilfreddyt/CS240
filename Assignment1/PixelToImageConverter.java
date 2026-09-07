package Assignment1;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.imageio.ImageIO;

public class PixelToImageConverter {

    public static Color convert(String value) {
        if (value.equals("R")) {
            return new Color(237, 28, 36);
        } else if (value.equals("B")) {
            return new Color(0, 0, 0);
        } else if (value.equals("Y")) {
            return new Color(255, 242, 0);
        } else {
            return new Color(255, 255, 255);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner inputFile = new Scanner(new File("output.txt"));

        ArrayList<String[]> rows = new ArrayList<>();

        while (inputFile.hasNextLine()) {
            String line = inputFile.nextLine();
            String[] pixels = line.split(" ");
            rows.add(pixels);
        }

        inputFile.close();

        int height = rows.size();
        int width = rows.get(0).length;

        BufferedImage image =
                new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int y = 0; y < height; y++) {
            String[] row = rows.get(y);

            for (int x = 0; x < width; x++) {
                Color color = convert(row[x]);
                image.setRGB(x, y, color.getRGB());
            }
        }

        ImageIO.write(image, "png", new File("recreatedsmiley.png"));
    }
}