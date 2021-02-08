package com.gs.pattern.solid.dependency.injection;

public class ClassRoomNonDI {

	private final Teacher teacher;
	private final Student student;
	
	public ClassRoomNonDI() {
		teacher = new Teacher() {};
		student = new Student() {};
	}
	
}
