package com.tms.trainerService;

import com.tms.dao.TrainerDaoImpl;
import com.tms.entity.Trainer;

public class TrainerServiceLogin {
private static TrainerDaoImpl dao = new TrainerDaoImpl();
    
    public boolean getEmail(String email) {
        return dao.validateTrainerByEmail(email);
    }
    public boolean getPassword(String email, String password) {
    	Trainer t=dao.getTrainerByEmail(email);
		if(password.equals(t.getPassword()))
			return true;
		else
			return false;
    }
}
