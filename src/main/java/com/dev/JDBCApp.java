package com.dev;

public class JDBCApp {
	public static void main(String[] args) {
		Movie m = new Movie();
		m.setId(1);
		m.setName("Logan");
		m.setRating(9);
		m.setSummery("Action");
		
		JDBCImpl db = new JDBCImpl();
		//db.save(m);
		System.out.println(db.getMovie(1));
		
		
		
		
		
	}
}
