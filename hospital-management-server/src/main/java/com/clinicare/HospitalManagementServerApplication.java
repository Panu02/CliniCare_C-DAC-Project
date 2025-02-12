package com.clinicare;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.clinicare.daos.IEmployeeDao;
import com.clinicare.daos.IPatientDao;
import com.clinicare.daos.IUserDao;
import com.clinicare.services.DoctorServices;

@SpringBootApplication()
public class HospitalManagementServerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HospitalManagementServerApplication.class, args);
	}

	@Autowired
	IUserDao userDao;
	@Autowired
	IEmployeeDao employeeDao;
	@Autowired
	IPatientDao patientDao;
	@Autowired
	DoctorServices dService;

	@Override
	@Transactional
	public void run(String... args) throws Exception {

		System.out.println(
				"===========================inside main function : welcome to hospital management app====================================");
		// Employee employee = employeeDao.getById(1);
//	System.out.println(employee.getUser());
//	System.out.println(employee);

//		dService.updatePatientDetails(new PatientDataBacking(1000));

	}

}
