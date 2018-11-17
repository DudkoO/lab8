package dentist;

import java.util.ArrayList;

public class PatientArrayList {

	private ArrayList<PatientInformation> patients = new ArrayList<PatientInformation>();

	PatientArrayList(PatientInformation patientArrayList) {
		this.patients.add(patientArrayList);
	}

	public void removeAllWithoutDebt() {
		for (int i = 0; i < patients.size(); i++) {
			if (patients.get(i).getIsPaid() == true) {
				patients.remove(patients.get(i));
			}
		}
	}

	public void searchDebtors() {
		for (PatientInformation patientInformation : patients) {
			if (patientInformation.getIsPaid() == false) {
				System.out.println(patientInformation);
			}
		}
	}

	public void searchPatient(String secondName) {
		for (PatientInformation patientInformation : patients) {
			if (patientInformation.toString().contains(secondName)) {
				System.out.println(patientInformation);
			}
		}
	}

	public void addParient(PatientInformation patientArrayList) {
		this.patients.add(patientArrayList);
	}

	public void showArrayList() {
		for (PatientInformation patientInformation : patients) {
			System.out.println(patientInformation);
			System.out.println("----------------------------");
		}
	}
}
