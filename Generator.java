import java.util.Dictionary;
import java.util.Hashtable;

public class Generator {
    // Generator.java && java Generator
    // snake_case to camelCase
    // RUNNING_NO => runningNo
    public static void main(String[] args) {
        String ans = "";
        // https://www.browserling.com/tools/newlines-to-spaces
        String columns = "RUNNING_NO FC_CODE ATM_PLACE ATM_ADDRESS ATM_ADDRESS_2 ATM_SUB_DISTRICT ATM_DISTRICT ATM_PROVINCE ATM_POST_CODE ATM_OPEN_DATE ATM_OPEN_TIME ATM_CREATE_DATE ATM_INSTALLATION_DATE CASH_TOPUP_CENTER OWN_BR_CODE PROVINCE_OF_OWN_BR CLEARING_BR_NAME CODE_OF_CLEARING_BR IN_OUT LO REGION AREA LO_N REG NEW_REG BRANCH_CODE ATM_TYPE FLAG_U DRIVE_2_WALK_UP CAMERA ANTI_SKIM UPS_BOX TCS_PLUS_OS2 TTW_LOBBY BARCODE_READER UPS MACHINE_STRUCTURE GROUP_OF_MACHINE CLOSE_DATE CODE SUB_CODE GROUP_OF_CODE NEW_CODE NEW_SUB_CODE NEW_ATM_CODE REMARK TYPE_OLD SERIAL_OLD SERIAL_NO OUTSOURCE ATM_CODE_OLD IP SNA CONNECTION USE_OS VENDER SPEED LOCATION DES_3 EPP EPP_TYPE STREET_ADDRESS_1 STREET_ADDRESS_2 STATE_PROV ATM_MANUFACTURER TYPE_OF_ATM STATUS START_DATE FINISH MARKET_GROUP CODE_SEGMENT SEGMENTATION CONTACT_NAME TELEPHONE EMAIL CCTV_PROJECT HARDWARE_NUMBER FIRMWARE_NUMBER LATITUDE LONGITUDE ORIGIN_FC_CODE"
                .toLowerCase();
        String[] columnsList = columns.split(" ");
        for (String phrase : columnsList) {
            // @Column(name = "REF_ID", nullable = false, length = 36)
            ans = ans + "@Column(name = \"" + phrase.toUpperCase() + "\", nullable = true, length = 10)\n";
            // System.out.println("@Column(name = \"" + phrase.toUpperCase() + "\", nullable
            // = true, length = 10)");
            while (phrase.contains("_")) {
                phrase = phrase.replaceFirst("_[a-z0-9]",
                        String.valueOf(Character.toUpperCase(phrase.charAt(phrase.indexOf("_") + 1))));
            }
            // private String refId;
            // System.out.println("private String " + phrase + ";\n");
            ans = ans + "private String " + phrase + ";\n\n";
        }
        System.out.print(ans);
        // TODO write to a file

    }
}