import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

public class TestSolve {
    @Test
    public void solveTest() throws FileNotFoundException {
        Solver solver = new Solver();
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Current relative path is: " + s);
        Scanner sc = new Scanner(new File("input_for_test"));
        String[] fileNames = new String[11];
        String[] fileNameGrammars = new String[2];
        int[] q1 = new int[11];
        int[] q2 = new int[11];
        System.out.println(sc.next());
        fileNameGrammars[0] = "grammars" + File.separator + sc.next();
        fileNameGrammars[1] = "grammars" + File.separator + sc.next();
        for (int i = 0; i < 11; i++) {
            fileNames[i] = "data" + File.separator + sc.next();
            q1[i] = sc.nextInt();
            q2[i] = sc.nextInt();
        }
        for (String grammarName : fileNameGrammars) {
            System.out.println(grammarName);
            for (int i = 0; i < fileNames.length; i++) {
                int num = solver.solve(grammarName, fileNames[i]);
                int answer = 0;
                if (grammarName.contains("grammar1")) {
                    answer = q1[i];
                } else if (grammarName.contains("grammar2")) {
                    answer = q2[i];
                }
                assertEquals(num, answer);
            }
        }
    }
}
