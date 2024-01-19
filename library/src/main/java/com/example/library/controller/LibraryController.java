package com.example.library.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.DataNotFoundException;
import com.example.demo.exception.ErrorInputException;
import com.example.library.dto.Tranrq001;
import com.example.library.dto.Tranrq002;
import com.example.library.dto.Tranrq003;
import com.example.library.dto.Tranrs001;
import com.example.library.dto.Tranrs002;
import com.example.library.dto.Tranrs003;
import com.example.library.service.LibrarySvc;

@RestController
@RequestMapping("/api/v1")

public class LibraryController {
	@Autowired
	private LibrarySvc librarySvc;

	// 註冊會員 (新增API)
	@PostMapping("/createUser")
	public Tranrs002 create(@RequestBody Tranrq002 tranrq, Errors errors) throws ErrorInputException, IOException {
		if (errors.hasErrors()) {
			throw new ErrorInputException();
		}
		return librarySvc.create(tranrq);
	}

	// 會員登入 (查詢API)
	@PostMapping("/queryUserId")
	public Tranrs001 query(@RequestBody Tranrq001 tranrq, Errors errors)
			throws ErrorInputException, DataNotFoundException, IOException {
		if (errors.hasErrors()) {
			throw new ErrorInputException();
		}
		return librarySvc.query(tranrq);
	}

	// 書籍DB查詢
	@PostMapping("/queryBookInfo")
	public Tranrs003 query(@RequestBody Tranrq003 tranrq, Errors errors) throws ErrorInputException, IOException {
		if (errors.hasErrors()) {
			throw new ErrorInputException();
		}
		return librarySvc.queryBookInfo(tranrq);
	}

}
