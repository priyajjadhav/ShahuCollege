package com.racks.studentInfo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.racks.studentInfo.model.ModelRahul;

@Repository
public interface RepositoryRahul extends JpaRepository<ModelRahul,Long>{

}
