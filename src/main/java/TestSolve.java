import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class TestSolve {
    @Test
    public void solveTest() throws FileNotFoundException {
        Solver solver = new Solver();
        try {
            assertEquals(solver.solve("grammars/grammar1", "data/skos.dot"), 810); // skos.dot 810 1
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }        
        System.out.println("adsasdadasd");
//        Scanner sc = new Scanner(new File("input_for_test"));
//        String[] fileNames = new String[11];
//        String[] fileNameGrammars = new String[2];
//        int[] q1 = new int[11];
//        int[] q2 = new int[11];
//        sc.next();
//        fileNameGrammars[0] = "grammars" + File.separator + sc.next();
//        fileNameGrammars[1] = "grammars" + File.separator + sc.next();
//        for (int i = 0; i < 11; i++) {
//            fileNames[i] = Paths.get("data" + File.separator + sc.next()).toString();
//            q1[i] = sc.nextInt();
//            q2[i] = sc.nextInt();
//        }
//        for (String grammarName : fileNameGrammars) {
//            System.out.println(grammarName);
//            for (int i = 0; i < fileNames.length; i++) {
//                int num = solver.solve(grammarName, fileNames[i]);
//                int answer = 0;
//                if (grammarName.contains("grammar1")) {
//                    answer = q1[i];
//                } else if (grammarName.contains("grammar2")) {
//                    answer = q2[i];
//                }
//                assertEquals(num, answer);
//            }
//        }
    }
}
