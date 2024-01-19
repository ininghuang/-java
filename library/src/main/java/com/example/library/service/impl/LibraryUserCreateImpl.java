package com.example.library.service.impl;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.exception.DataNotFoundException;
import com.example.demo.exception.ErrorInputException;
import com.example.library.dto.Tranrq001;
import com.example.library.dto.Tranrq002;
import com.example.library.dto.Tranrq003;
import com.example.library.dto.Tranrs001;
import com.example.library.dto.Tranrs002;
import com.example.library.dto.Tranrs003;
import com.example.library.entity.LibraryUserEntity;
import com.example.library.repository.LibraryRepository;
import com.example.library.service.LibrarySvc;

@Service
public class LibraryUserCreateImpl implements LibrarySvc {

	@Autowired
	private LibraryRepository libraryRepository;

	private DateTimeFormatter REGISTRATION_TIME = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

	// 會員註冊
	@Override
	public Tranrs002 create(Tranrq002 tranrq) throws ErrorInputException, IOException {
		LibraryUserEntity entity = new LibraryUserEntity();
		entity.setUserId(tranrq.getUserId());
		entity.setPhoneNumber(tranrq.getPhoneNumber());
		entity.setPassword(tranrq.getPassword());
		entity.setUserName(tranrq.getUserName());
		entity.setRegistartionTime(REGISTRATION_TIME.format(LocalDateTime.now()));
		libraryRepository.save(entity);
		Tranrs002 tranrs = new Tranrs002();
		tranrs.setResponse("交易成功");
		return tranrs;
	}

	// 會員登入
	@Override
	public Tranrs001 query(Tranrq001 request) throws DataNotFoundException {
		LibraryUserEntity entity = libraryRepository.findByUserId(request.getUserId());
		entity.setUserId(request.getUserId());
		Optional<LibraryUserEntity> reEntity = libraryRepository.findById(entity.getUserId());
		Tranrs001 tranrs = new Tranrs001();
		if (reEntity.isPresent()) {
			tranrs.setUserId(reEntity.get().getUserId());
			tranrs.setPassword(reEntity.get().getPassword());
			if (reEntity.get().getPhoneNumber() != null) {
				tranrs.setPhoneNumber(reEntity.get().getPhoneNumber());
			}
			if (reEntity.get().getUserName() != null) {
				tranrs.setUserName(reEntity.get().getUserName());
			}
			tranrs.setRegistartionTime(reEntity.get().getRegistartionTime());
			tranrs.setLastLoginTime(REGISTRATION_TIME.format(LocalDateTime.now()));
		}
		return tranrs;
	}

	// 書籍資料查詢
	@Override
	public Tranrs003 queryBookInfo(Tranrq003 tranrq) {

		return null;
	}

}
