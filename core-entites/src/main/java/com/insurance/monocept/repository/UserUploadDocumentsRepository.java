package com.insurance.monocept.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import com.insurance.monocept.entity.Insurance;
import com.insurance.monocept.entity.User;
import com.insurance.monocept.entity.UserUploadDocuments;

@Transactional
public interface UserUploadDocumentsRepository extends JpaRepository<UserUploadDocuments, Long>{

	List<UserUploadDocuments> findByStatus(String string, Pageable pageable);
	
	List<UserUploadDocuments> findByStatus(String string);

	UserUploadDocuments findByUserAndInsurance(User user, Insurance insurance);

	@Modifying
	void deleteByInsurance(Insurance insurance);

}
