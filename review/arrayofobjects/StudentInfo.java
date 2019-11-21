package arrayofobjects;

public class StudentInfo {

	public static void main(String[] args) {
		String []fNames = {"Isabel","Christine","Hush","Kimberly"};
		String []lNames = {"Thomas","Aparato","De Peralta","Duno"};
		int [] age = {19,20,31,25};
		int [] studentID = {2000064000,2000066525,2000065432,2000074125};
		
		StudentInfoSub[] st = new StudentInfoSub[fNames.length];
		
		for(int i =0; i<st.length;i++) {
			st[i] = new StudentInfoSub();
			st[i].setfName(fNames[i]);
			st[i].setlName(lNames[i]);
			st[i].setAge(age[i]);
			String gender = "f";
			if(fNames[i].equals("Daryl")) {
				gender = "m";
			}
			st[i].setGender(gender);
			String section = "BSIT-601";
			if(fNames[i].equals("Kimberly")) {
				section = "BSIT-301";
			}
			st[i].setSection(section);
			st[i].setStudentID(studentID[i]);
		}
		st[0].printInfo();
	}

}
