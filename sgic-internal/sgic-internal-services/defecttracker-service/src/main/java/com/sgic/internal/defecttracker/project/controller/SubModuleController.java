package com.sgic.internal.defecttracker.project.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.common.api.enums.RestApiResponseStatus;
import com.sgic.common.api.response.ApiResponse;
import com.sgic.internal.defecttracker.project.controller.dto.SubModuleDto;
import com.sgic.internal.defecttracker.project.controller.dtomapper.SubModuleDtoMapper;


@RestController
public class SubModuleController {
	
	@Autowired
	public SubModuleDtoMapper subModuleDtoMapper;
	
	@PostMapping(value="/createsubmodule")
	public ResponseEntity<Object>createSubModule(@RequestBody SubModuleDto subModuleDto) {
	subModuleDtoMapper.saveSubModuleforMapper(subModuleDto);
	return new ResponseEntity<>(new ApiResponse(RestApiResponseStatus.OK),HttpStatus.OK);
	}
	
	
	
}

	
	