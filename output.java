import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
@Entity
@Table(name = "FAST_EASY_PAYMENT_TRANSACTIONS")
public class FastEasyPaymentTransaction {

@Column(name = "NAME" , length =length)
private String name;

@Column(name = "RUNNING_NO" , length =30)
private String runningNo;

@Column(name = "FC_CODE" , length =50)
private String fcCode;

@Column(name = "ATM_PLACE" , length =50)
private String atmPlace;

@Column(name = "ATM_ADDRESS" , length =500)
private String atmAddress;

@Column(name = "ATM_ADDRESS_2" , length =10)
private String atmAddress2;

@Column(name = "ATM_SUB_DISTRICT" , length =5)
private String atmSubDistrict;

@Column(name = "ATM_DISTRICT" , nullable = false ,length =20)
private String atmDistrict;

@Column(name = "ATM_PROVINCE" , length =200)
private String atmProvince;

@Column(name = "ATM_POST_CODE" , length =200)
private String atmPostCode;

@Column(name = "ATM_OPEN_DATE" , length =50)
private String atmOpenDate;

@Column(name = "ATM_OPEN_TIME" , length =50)
private String atmOpenTime;

@Column(name = "ATM_CREATE_DATE" , length =10)
private String atmCreateDate;

@Column(name = "ATM_INSTALLATION_DATE" , length =20)
private String atmInstallationDate;

@Column(name = "CASH_TOPUP_CENTER" , length =10)
private String cashTopupCenter;

@Column(name = "OWN_BR_CODE" , length =10)
private String ownBrCode;

@Column(name = "PROVINCE_OF_OWN_BR" , length =20)
private String provinceOfOwnBr;

@Column(name = "CLEARING_BR_NAME" , length =50)
private String clearingBrName;

@Column(name = "CODE_OF_CLEARING_BR" , nullable = false ,length =50)
private String codeOfClearingBr;

@Column(name = "IN_OUT" , length =100)
private String inOut;

@Column(name = "LO" , length =100)
private String lo;

@Column(name = "REGION" , length =200)
private String region;

@Column(name = "AREA" , length =100)
private String area;

@Column(name = "LO_N" , length =20)
private String loN;

@Column(name = "REG" , length =20)
private String reg;

@Column(name = "NEW_REG" , length =20)
private String newReg;

@Column(name = "BRANCH_CODE" , length =20)
private String branchCode;

@Column(name = "ATM_TYPE" , length =5)
private String atmType;

}