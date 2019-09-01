package com.toniebe.springboot2trainingtelkom2019;

import com.toniebe.springboot2trainingtelkom2019.model.Mahasiswa;
import org.springframework.data.repository.CrudRepository;

public interface MahasiswaRepository extends CrudRepository<Mahasiswa,Integer> {
}
