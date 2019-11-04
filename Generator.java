import java.util.Dictionary;
import java.util.Hashtable;

public class Generator {
    // Generator.java && java Generator
    // RUNNING_NO => runningNo
    public static void main(String[] args) {
        // https://www.browserling.com/tools/newlines-to-spaces
        String columns = "REMARK TYPE_OLD SERIAL_OLD SERIAL_NO OUTSOURCE ATM_CODE_OLD IP SNA CONNECTION USE_OS VENDER SPEED LOCATION DES_3 EPP EPP_TYPE STREET_ADDRESS_1 STREET_ADDRESS_2 STATE_PROV ATM_MANUFACTURER TYPE_OF_ATM STATUS START_DATE FINISH MARKET_GROUP CODE_SEGMENT SEGMENTATION CONTACT_NAME TELEPHONE EMAIL CCTV_PROJECT HARDWARE_NUMBER FIRMWARE_NUMBER LATITUDE LONGITUDE ORIGIN_FC_CODE"
                .toLowerCase();
        String[] columnsList = columns.split(" ");
        for (String phrase : columnsList) {
            while (phrase.contains("_")) {
                phrase = phrase.replaceFirst("_[a-z0-9]",
                        String.valueOf(Character.toUpperCase(phrase.charAt(phrase.indexOf("_") + 1))));
            }
            System.out.println(phrase);
        }

    }
}