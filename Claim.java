package insurancebl;

import java.util.Date;

public class Claim {

	private String claimId;
	private Date claimDate;
	private String patientName;
	private String hospitalName;
	private Date dateOfAdmission;
	private double claimAmount;
	private String claimStatus;
	private String claimRemarks;

	public Claim() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public String getClaimId() {
		return claimId;
	}

	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}

	public Date getClaimDate() {
		return claimDate;
	}

	public void setClaimDate(Date claimDate) {
		this.claimDate = claimDate;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public Date getDateOfAdmission() {
		return dateOfAdmission;
	}

	public void setDateOfAdmission(Date dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}

	public double getClaimAmount() {
		return claimAmount;
	}

	public void setClaimAmount(double claimAmount) {
		this.claimAmount = claimAmount;
	}

	public String getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public String getClaimRemarks() {
		return claimRemarks;
	}

	public void setClaimRemarks(String claimRemarks) {
		this.claimRemarks = claimRemarks;
	}

}
