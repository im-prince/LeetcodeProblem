package Array;

import java.util.Arrays;

public class FlippingAnImage_832 {


    static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int a = 0, r = image[0].length - 1;
            while (a <= r) {
                int temp = image[i][a];
                image[i][a] = image[i][r];
                image[i][r] = temp;
                a++;
                r--;
            }
        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}
