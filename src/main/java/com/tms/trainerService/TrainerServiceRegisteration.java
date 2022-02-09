package com.tms.trainerService;

import com.tms.dao.TrainerDaoImpl;
import com.tms.entity.Trainer;

public class TrainerServiceRegisteration {
	static TrainerDaoImpl trainerDAO = new TrainerDaoImpl();

    public String addTrainerInfo
            (int id, String first,String last, String email, String pass){
        Trainer trainer = new Trainer();
        trainer.setTrainerId(id);
        trainer.setFirstName(first);
        trainer.setLastName(last);
        trainer.setEmail(email);
        trainer.setPassword(pass);
        trainerDAO.addTrainer(trainer);

        return "Trainer Added Sucessfully";
    }

   
}
