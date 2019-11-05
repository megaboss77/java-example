import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Generator {

    public static void main(String[] args) throws IOException {
        // javac Generator.java && java Generator ATM_LOCATION.csv output.java
        if (args.length != 2) {
            System.out.println("please use command \njava Generator <input file csv> <output.java>");
        } else {
            String ans = "import javax.persistence.Column;\n" + "import javax.persistence.Entity;\n"
                    + "import javax.persistence.Id;\n" + "import javax.persistence.Table;\n"
                    + "import java.time.LocalDateTime;\n" + "@Entity\n"
                    + "@Table(name = \"FAST_EASY_PAYMENT_TRANSACTIONS\")\n"
                    + "public class FastEasyPaymentTransaction {\n" + "\n";
            Map<String, String[]> apiList = new LinkedHashMap<String, String[]>();
            File file = new File(args[0]);
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] words = line.split(",");
                apiList.put(words[0].toLowerCase(), words);
            }
            sc.close();
            for (String phrase : apiList.keySet()) {
                ans = ans + "@Column(name = \"" + phrase.toUpperCase() + "\" , " + nullable(apiList.get(phrase)[1])
                        + "length =" + apiList.get(phrase)[3] + ")\n";
                String fieldName = changeToCamel(phrase);
                ans = ans + "private " + getDataType(apiList.get(phrase)[2]) + " " + fieldName + ";\n\n";
            }
            ans = ans + "}";
            FileWriter writer = new FileWriter(args[1]);
            writer.write(ans);
            writer.close();
            System.out.println("Generated model into the file " + args[1]);
        }

    }

    private static String changeToCamel(String phrase) {
        // String tem = phrase;
        while (phrase.contains("_")) {
            phrase = phrase.replaceFirst("_[a-z0-9]",
                    String.valueOf(Character.toUpperCase(phrase.charAt(phrase.indexOf("_") + 1))));
        }
        return phrase;
    }

    private static String nullable(String yn) {
        if ("N".equals(yn)) {
            return "nullable = false ,";
        } else {
            return "";
        }
    }

    private static String getDataType(String dataType) {
        if ("VARCHAR".equals(dataType)) {
            return "String";
        } else {
            return "String";
        }
        // to be implement other datatype
    }
}
