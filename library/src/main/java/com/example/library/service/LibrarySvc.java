package com.example.library.service;

import java.io.IOException;

import com.example.demo.exception.DataNotFoundException;
import com.example.demo.exception.ErrorInputException;
import com.example.library.dto.Tranrq001;
import com.example.library.dto.Tranrq002;
import com.example.library.dto.Tranrq003;
import com.example.library.dto.Tranrs001;
import com.example.library.dto.Tranrs002;
import com.example.library.dto.Tranrs003;

public interface LibrarySvc {

	Tranrs002 create(Tranrq002 tranrq) throws ErrorInputException, IOException;

	Tranrs001 query(Tranrq001 request) throws ErrorInputException, IOException, DataNotFoundException;

	Tranrs003 queryBookInfo(Tranrq003 tranrq);

}
