package com.gs.pattern.solid.dependency.injection;

public class ClassRoomDI {

	private final Teacher teacher;
	private final Student student;
	
	public ClassRoomDI(Teacher teacher, Student student) {
		this.teacher = teacher;
		this.student = student;
	}
	
}
