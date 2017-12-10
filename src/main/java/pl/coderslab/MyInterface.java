package pl.coderslab;

import javax.transaction.Transactional;

public interface MyInterface {

	
	 @Transactional
	void resetRating(int rating);
		
		
	
	
}
