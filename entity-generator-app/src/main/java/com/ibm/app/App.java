package com.ibm.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class App {

    // java -cp target/entity-generator-app-1.0-SNAPSHOT.jar com.ibm.app.App
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.out.println("please use command \njava Generator <output file>");
        } else if (args.length == 1) {
            String ans = "";
            String[] properties = new String[2];
            // https://www.browserling.com/tools/newlines-to-spaces
            String csv = new FileInputStream(new File(args[0]))
            String lines[] = csv.split("\\r?\\n");
            String columns = "RUNNING_NO FC_CODE ATM_PLACE ATM_ADDRESS ATM_ADDRESS_2 ATM_SUB_DISTRICT ATM_DISTRICT ATM_PROVINCE ATM_POST_CODE ATM_OPEN_DATE ATM_OPEN_TIME ATM_CREATE_DATE ATM_INSTALLATION_DATE CASH_TOPUP_CENTER OWN_BR_CODE PROVINCE_OF_OWN_BR CLEARING_BR_NAME CODE_OF_CLEARING_BR IN_OUT LO REGION AREA LO_N REG NEW_REG BRANCH_CODE ATM_TYPE FLAG_U DRIVE_2_WALK_UP CAMERA ANTI_SKIM UPS_BOX TCS_PLUS_OS2 TTW_LOBBY BARCODE_READER UPS MACHINE_STRUCTURE GROUP_OF_MACHINE CLOSE_DATE CODE SUB_CODE GROUP_OF_CODE NEW_CODE NEW_SUB_CODE NEW_ATM_CODE REMARK TYPE_OLD SERIAL_OLD SERIAL_NO OUTSOURCE ATM_CODE_OLD IP SNA CONNECTION USE_OS VENDER SPEED LOCATION DES_3 EPP EPP_TYPE STREET_ADDRESS_1 STREET_ADDRESS_2 STATE_PROV ATM_MANUFACTURER TYPE_OF_ATM STATUS START_DATE FINISH MARKET_GROUP CODE_SEGMENT SEGMENTATION CONTACT_NAME TELEPHONE EMAIL CCTV_PROJECT HARDWARE_NUMBER FIRMWARE_NUMBER LATITUDE LONGITUDE ORIGIN_FC_CODE"
                    .toLowerCase();
            String[] columnsList = columns.split(" ");
            for (String phrase : columnsList) {
                // @Column(name = "REF_ID", nullable = false, length = 36)
                ans = ans + "@Column(name = \"" + phrase.toUpperCase() + "\", nullable = true, length = 10)\n";
                while (phrase.contains("_")) {
                    phrase = phrase.replaceFirst("_[a-z0-9]",
                            String.valueOf(Character.toUpperCase(phrase.charAt(phrase.indexOf("_") + 1))));
                }
                // private String refId;
                ans = ans + "private String " + phrase + ";\n\n";
            }
            // System.out.print(ans);
            FileWriter writer = new FileWriter(args[0]);
            writer.write(ans);
            writer.close();
            System.out.println("Generated model into the file " + args[0]);
        } else if (args.length == 2) {
            // FileInputStream excelFile = new FileInputStream(new File(args[0]));
            // XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
            // log.debug("This excel contain " + workbook.getNumberOfSheets() + "sheet(s)");
            //Sheet firstSheet = workbook.getSheetAt(0);
            // log.debug("First sheet is " + firstSheet.getSheetName());
            Row firstRow = firstSheet.getRow(0);
            // EndpointProcessor endpointProcessor = new EndpointProcessor(firstRow);
            // endpointProcessor.setOperationTag(firstSheet.getSheetName());
        }
    }
}
