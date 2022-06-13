import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SolveExpressionsFromFile {

    public void readAndSolveFile(String path){
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                SolveAndPrint(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void SolveAndPrint(String line) {
        Pattern pt = Pattern.compile("(\\d+)([-+*/])(\\d*)");
        Matcher matcher = pt.matcher(line);
        String operation;

        while (matcher.find()) {
            int left = 0;
            int right = 0;
            int res = 0;
            left = Integer.parseInt(matcher.group(1));
            right = Integer.parseInt(matcher.group(3));
            operation = matcher.group(2);
            switch (operation) {
                case "-":
                    res = left - right;
                    break;
                case "+":
                    res = left + right;
                    break;
                case "/":
                    if (right != 0) {
                        res = left / right;
                        break;
                    }
                case "*":
                    res = left * right;
                    break;
            }
            System.out.println(res);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        SolveExpressionsFromFile solver = new SolveExpressionsFromFile();
        solver.readAndSolveFile("src/text.txt");
    }
}