package classSchedule.persist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import classSchedule.model.Course;
import classSchedule.model.Major;
import classSchedule.model.Professor;




import classSchedule.model.User;

public class FakeDatabase implements IDatabase {
	private List<User> userList;
	private List<Course> courseList;
	private List<Professor> professorList;
	private List<Major> majorList;

	
	public FakeDatabase() {
		userList = new ArrayList<>();

		courseList = new ArrayList<>();
		professorList = new ArrayList<>();
		// TODO: add some  test users and test courses
		majorList = new ArrayList<>();
		// TODO: add some  test users
		
		readInitialData();

	}
	public void readInitialData() {
		try {
			userList.addAll(InitialData.getUsers());
			majorList.addAll(InitialData.getMajors());
		} catch (IOException e) {
			throw new IllegalStateException("Couldn't read initial data", e);
		}
	}
	@Override
	public User findUser(String username, String password, int id) {
			User result = new User();
			for(User use: userList)
			{
				if(use.getPassword().equals(password) && use.getUsername().equals(username))
				{
					User userResult = findUserById(use.getId());
					result = userResult;
					
				}
			}
			//
			return result;
	}

	private User findUserById(int id) {
		for(User use: userList)
		{
			if(use.getId() == id)
			{
				return use;
			}
		}
		return null;
	}
	@Override
	public Major findMajor(String major, boolean isMinor, int ID) {
		for(Major majorindex:majorList)
		{
			if(majorindex.getName().equals(major) || majorindex.getId() == ID)
				return majorindex;
		}
		
		Major invalidMajor = new Major();
		invalidMajor.setId(999);
		invalidMajor.setName("Not Found");
		return invalidMajor;
		
		
	}
	
	@Override
	public Course findCoursebyTitle(String courseName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course findCoursebyCRN(int CRN) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Professor findProfessor(String firstname, String lastname) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public User findUser(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}
}
