package com.vishalsingh.Employe_Management_System.EmpRepo;

import com.vishalsingh.Employe_Management_System.Model.EmpModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmpRepo extends CrudRepository<EmpModel,Integer> {
    EmpModel findById(int id);
    }

