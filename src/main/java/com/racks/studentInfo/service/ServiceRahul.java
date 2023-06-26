package com.racks.studentInfo.service;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;

import com.racks.studentInfo.model.ModelRahul;

@ComponentScan("com.racks.studentInfo.service")
public interface ServiceRahul {
	public ModelRahul saveRahul(ModelRahul modelRahul);
	
	public List<ModelRahul> getAllRahul();

}
