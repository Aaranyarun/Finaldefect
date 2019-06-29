package com.sgic.internal.defecttracker.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.sgic.common.api.enums.RestApiResponseStatus;
import com.sgic.common.api.response.ApiResponse;
import com.sgic.internal.defecttracker.project.controller.dto.ModuleDto;
import com.sgic.internal.defecttracker.project.controller.dtomapper.ModuleDtoMapper;

@RestController
public class ModuleController {
	
	@Autowired
	public ModuleDtoMapper moduleDtoMapper;
	
	@PostMapping(value="/createmodule")
	public ResponseEntity<Object>createModule (@RequestBody ModuleDto moduleDto){
		moduleDtoMapper.saveModuleforMapper(moduleDto);
		return new ResponseEntity<>(new ApiResponse(RestApiResponseStatus.OK), HttpStatus.OK);
	
}
//	// Author :: by Mercy
//		// Post Mapping For Create a Project
//		@GetMapping(value = "/GetAllproject")
//		public ResponseEntity<List<ProjectDto>> listEmployeeInfo() {
//			logger.info("Project are listed ");
//			return new ResponseEntity<>(projectDtoMapper.getAllProjectForMapper(), HttpStatus.OK);
//		}

		
		// Get Mapping For Get Project By Id
		@GetMapping("/getModuleById/{id}")
		public ResponseEntity<ModuleDto> getProjectById(@PathVariable String id) {
//			logger.info("Projects are get by id ");
			return new ResponseEntity<>(moduleDtoMapper.getByModuleId(id), HttpStatus.OK);
		}

		
		// Delete Mapping For Project
		@DeleteMapping("deleteById/{moduleId}")
		public ResponseEntity<ModuleDto> deleteById(@PathVariable String projectId) {
//			logger.info("Projects are delete by id ");
			return new ResponseEntity<>(moduleDtoMapper.deleteById(projectId), HttpStatus.OK);
		}

		
		// Put Mapping For Project
		@PutMapping("/updateProject/{moduleId}")
		public ResponseEntity<String> updateProject(@PathVariable(name = "moduleId") String moduleId,
				@RequestBody ModuleDto moduleDto) {
//			logger.info("Projectcontroller -> updatedproject");
			if (moduleDtoMapper.UpdateModule(moduleId, moduleDto) != null)
				;
			{
				return new ResponseEntity<>("ok", HttpStatus.OK);
			}
		}

		
		// Get Mapping For Project Name
		@GetMapping("/getName/{moduleName}")
		public List<ModuleDto> getByprojectName(@PathVariable String moduleName) {
//			logger.info("Projects are get by name ");
			return moduleDtoMapper.getBymoduleNameForMapper(moduleName);
		}

		
		

		

		

		

}
