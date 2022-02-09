package com.tms.dao;

import java.util.List;

import com.tms.entity.Trainer;

public interface TrainerDao {
	
	public void addTrainer(Trainer trainer);

   // public List<Trainer> getTrainerList();

    public Trainer getTrainerByEmail(String email);
	
	public boolean validateTrainerByEmail(String email);
}
