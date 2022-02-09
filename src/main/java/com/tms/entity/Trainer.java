package com.tms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trainer")
public class Trainer {
	@Id
	@Column(name = "trainerId")
	 private int trainerId;
	    private String firstName;
	    private String lastName;
	    private String email;
	    private String password;
	    public Trainer() {}
	    
	    public Trainer(int trainerId, String firstName, String lastName, String email, String password) {
			super();
			this.trainerId = trainerId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.password = password;
		}

		public int getTrainerId() {
			return trainerId;
		}

		public void setTrainerId(int trainerId) {
			this.trainerId = trainerId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "Trainer [trainerId=" + trainerId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
					+ email + ", password=" + password + "]";
		}
	    


}
