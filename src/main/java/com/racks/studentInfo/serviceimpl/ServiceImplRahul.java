package com.racks.studentInfo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.racks.studentInfo.Repository.RepositoryRahul;
import com.racks.studentInfo.model.ModelRahul;
import com.racks.studentInfo.service.ServiceRahul;

@Service
public class ServiceImplRahul implements ServiceRahul{

@Autowired
private RepositoryRahul repo;
	
	
	@Override
	public ModelRahul saveRahul(ModelRahul modelRahul) {
				return repo.save(modelRahul);
	}


	@Override
	public List<ModelRahul> getAllRahul() {
		return repo.findAll();
	}
}
