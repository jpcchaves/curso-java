package entities;

public class School {

	public String student;
	public double n1, n2, n3;

	public double finalGrade() {
		return (n1 + n2 + n3) / 3;
	}

	public double missingPoints() {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		} else {
			return 0.0;
		}
	}
}
