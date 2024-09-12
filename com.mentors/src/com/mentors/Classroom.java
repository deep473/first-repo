package com.mentors;

public class Classroom {

	Mentor mentor;	

	public Classroom(Mentor mentor) {
		this.mentor = mentor;
	}

	public void conductSession() {
		mentor.teach();
		mentor.takeAttendance();
	}
}
