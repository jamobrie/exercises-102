package questions;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercise1 {

    public static void main(String[] args) {
        final Path path = Paths.get(".").normalize();
        int count = 0;
        for (int i = 0; i < path.getNameCount(); ++i) {
            count++;
        }
        System.out.println(count);

        int chicken = 0;
        double iguana = 0;
        do {
            int snake = 1;
            System.out.print(snake++ + chicken++ + " ");
            iguana--;
        } while (chicken <= 5);
        System.out.println(iguana);
    }


}
