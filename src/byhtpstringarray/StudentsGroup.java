package byhtpstringarray;

public class StudentsGroup {

	//add unlimited number of students
	//print all students from group to console
	private Student[] students;
	private int studentsCounter;

	
	public void setStudents(Student[] students){
		if(students != null)
		this.students = students;
	}
	
	public Student[] getStudents(){
		return this.students;
	}

	public void addStudent(Student student){
    	if(this.students != null){
    		if(studentsCounter < students.length){
    			students[studentsCounter] = student;
    			studentsCounter++;
    		}else{
    			Student[] students = new Student[this.students.length + 10];
    			for(int i=0; i<this.students.length; i++){
    				students[i] = this.students[i];    				
    			}
    			this.students = students;
    			this.students[studentsCounter] = student;
    			studentsCounter++;
       		}
    	}
    	else {
    		this.students = new Student[10];
    		this.students[0] = student;
    		studentsCounter++;
    	    }
        }
     }

