package ch15.practice.prac08;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.name = name;
		this.studentNum = studentNum;
	}
	
	@Override
	public int hashCode() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student student) {
			if(studentNum == student.studentNum) {
				return true;
			}else {return false;}
		}else {return false;}
			
	}

}
