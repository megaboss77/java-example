import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
@Entity
@Table(name = "ATM_LOCATION")
public class AtmLocation {

	@Column(name = "RUNNING_NO" , length = 30)
	private String runningNo;

	@Column(name = "FC_CODE" , length = 50)
	private String fcCode;

	@Column(name = "ATM_PLACE" , length = 50)
	private String atmPlace;

	@Column(name = "ATM_ADDRESS" , length = 500)
	private String atmAddress;

	@Column(name = "ATM_ADDRESS_2" , length = 10)
	private String atmAddress2;

	@Column(name = "ATM_SUB_DISTRICT" , length = 5)
	private String atmSubDistrict;

	@Column(name = "ATM_DISTRICT" , nullable = false ,length = 20)
	private String atmDistrict;

	@Column(name = "ATM_PROVINCE" , length = 200)
	private String atmProvince;

	@Column(name = "ATM_POST_CODE" , length = 200)
	private String atmPostCode;

	@Column(name = "ATM_OPEN_DATE" , length = 50)
	private String atmOpenDate;

	@Column(name = "ATM_OPEN_TIME" , length = 50)
	private String atmOpenTime;

	@Column(name = "ATM_CREATE_DATE" , length = 10)
	private String atmCreateDate;

	@Column(name = "ATM_INSTALLATION_DATE" , length = 20)
	private String atmInstallationDate;

	@Column(name = "CASH_TOPUP_CENTER" , length = 10)
	private String cashTopupCenter;

	@Column(name = "OWN_BR_CODE" , length = 10)
	private String ownBrCode;

	@Column(name = "PROVINCE_OF_OWN_BR" , length = 20)
	private String provinceOfOwnBr;

	@Column(name = "CLEARING_BR_NAME" , length = 50)
	private String clearingBrName;

	@Column(name = "CODE_OF_CLEARING_BR" , nullable = false ,length = 50)
	private String codeOfClearingBr;

	@Column(name = "IN_OUT" , length = 100)
	private String inOut;

	@Column(name = "LO" , length = 100)
	private String lo;

	@Column(name = "REGION" , length = 200)
	private String region;

	@Column(name = "AREA" , length = 100)
	private String area;

	@Column(name = "LO_N" , length = 20)
	private String loN;

	@Column(name = "REG" , length = 20)
	private String reg;

	@Column(name = "NEW_REG" , length = 20)
	private String newReg;

	@Column(name = "BRANCH_CODE" , length = 20)
	private String branchCode;

	@Column(name = "ATM_TYPE" , length = 5)
	private String atmType;

	public String getRunningNo() {
		return runningNo;
		}
	public void setRunningNo(String runningNo) {
		this.runningNo = runningNo;
		}
	public String getFcCode() {
		return fcCode;
		}
	public void setFcCode(String fcCode) {
		this.fcCode = fcCode;
		}
	public String getAtmPlace() {
		return atmPlace;
		}
	public void setAtmPlace(String atmPlace) {
		this.atmPlace = atmPlace;
		}
	public String getAtmAddress() {
		return atmAddress;
		}
	public void setAtmAddress(String atmAddress) {
		this.atmAddress = atmAddress;
		}
	public String getAtmAddress2() {
		return atmAddress2;
		}
	public void setAtmAddress2(String atmAddress2) {
		this.atmAddress2 = atmAddress2;
		}
	public String getAtmSubDistrict() {
		return atmSubDistrict;
		}
	public void setAtmSubDistrict(String atmSubDistrict) {
		this.atmSubDistrict = atmSubDistrict;
		}
	public String getAtmDistrict() {
		return atmDistrict;
		}
	public void setAtmDistrict(String atmDistrict) {
		this.atmDistrict = atmDistrict;
		}
	public String getAtmProvince() {
		return atmProvince;
		}
	public void setAtmProvince(String atmProvince) {
		this.atmProvince = atmProvince;
		}
	public String getAtmPostCode() {
		return atmPostCode;
		}
	public void setAtmPostCode(String atmPostCode) {
		this.atmPostCode = atmPostCode;
		}
	public String getAtmOpenDate() {
		return atmOpenDate;
		}
	public void setAtmOpenDate(String atmOpenDate) {
		this.atmOpenDate = atmOpenDate;
		}
	public String getAtmOpenTime() {
		return atmOpenTime;
		}
	public void setAtmOpenTime(String atmOpenTime) {
		this.atmOpenTime = atmOpenTime;
		}
	public String getAtmCreateDate() {
		return atmCreateDate;
		}
	public void setAtmCreateDate(String atmCreateDate) {
		this.atmCreateDate = atmCreateDate;
		}
	public String getAtmInstallationDate() {
		return atmInstallationDate;
		}
	public void setAtmInstallationDate(String atmInstallationDate) {
		this.atmInstallationDate = atmInstallationDate;
		}
	public String getCashTopupCenter() {
		return cashTopupCenter;
		}
	public void setCashTopupCenter(String cashTopupCenter) {
		this.cashTopupCenter = cashTopupCenter;
		}
	public String getOwnBrCode() {
		return ownBrCode;
		}
	public void setOwnBrCode(String ownBrCode) {
		this.ownBrCode = ownBrCode;
		}
	public String getProvinceOfOwnBr() {
		return provinceOfOwnBr;
		}
	public void setProvinceOfOwnBr(String provinceOfOwnBr) {
		this.provinceOfOwnBr = provinceOfOwnBr;
		}
	public String getClearingBrName() {
		return clearingBrName;
		}
	public void setClearingBrName(String clearingBrName) {
		this.clearingBrName = clearingBrName;
		}
	public String getCodeOfClearingBr() {
		return codeOfClearingBr;
		}
	public void setCodeOfClearingBr(String codeOfClearingBr) {
		this.codeOfClearingBr = codeOfClearingBr;
		}
	public String getInOut() {
		return inOut;
		}
	public void setInOut(String inOut) {
		this.inOut = inOut;
		}
	public String getLo() {
		return lo;
		}
	public void setLo(String lo) {
		this.lo = lo;
		}
	public String getRegion() {
		return region;
		}
	public void setRegion(String region) {
		this.region = region;
		}
	public String getArea() {
		return area;
		}
	public void setArea(String area) {
		this.area = area;
		}
	public String getLoN() {
		return loN;
		}
	public void setLoN(String loN) {
		this.loN = loN;
		}
	public String getReg() {
		return reg;
		}
	public void setReg(String reg) {
		this.reg = reg;
		}
	public String getNewReg() {
		return newReg;
		}
	public void setNewReg(String newReg) {
		this.newReg = newReg;
		}
	public String getBranchCode() {
		return branchCode;
		}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
		}
	public String getAtmType() {
		return atmType;
		}
	public void setAtmType(String atmType) {
		this.atmType = atmType;
		}
}