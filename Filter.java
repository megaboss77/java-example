public class Filter {
    // javac Filter.java && java Filter
    public static void main(String[] args) {
        String a = "An operational data store (or \"ODS\") is used for operational reporting and as a source of data for the Enterprise Data Warehouse (EDW). It is a complementary element to an EDW in a decision support landscape, and is used for operational reporting, controls and decision making, as opposed to the EDW, which is used for tactical and strategic decision support.";
        for (int i = 0; i < a.length(); i++) {
            var b = Math.random();
            if (b > 0.5) {
                System.out.printf(a.substring(i, i + 1).toLowerCase());
            } else {
                System.out.printf(a.substring(i, i + 1).toUpperCase());
            }
        }
    }
}