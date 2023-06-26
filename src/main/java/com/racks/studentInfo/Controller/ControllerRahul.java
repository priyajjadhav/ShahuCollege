package com.racks.studentInfo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.racks.studentInfo.model.ModelRahul;
import com.racks.studentInfo.service.ServiceRahul;

@RestController
@RequestMapping("/student")
public class ControllerRahul {
	@Autowired
	private ServiceRahul serviceRahul;
	//http://localhost:8080/student/saveMember
	@PostMapping("/saveMember")
	public ResponseEntity<ModelRahul> saveRahul(@RequestBody ModelRahul modelRahul){
		ModelRahul MRahul=serviceRahul.saveRahul(modelRahul);
		return ResponseEntity.ok().body(MRahul);
	}
	
	//localhost:8082/student/getAll
	
	@GetMapping("/getAll")
	public List<ModelRahul> getAllRahul() {
		return serviceRahul.getAllRahul();
		
	}

	
	
	
}
