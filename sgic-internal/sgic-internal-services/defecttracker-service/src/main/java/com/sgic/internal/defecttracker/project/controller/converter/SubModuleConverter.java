package com.sgic.internal.defecttracker.project.controller.converter;


import java.util.ArrayList;
import java.util.List;

import com.sgic.internal.defecttracker.project.controller.dto.ModuleDto;
import com.sgic.internal.defecttracker.project.controller.dto.SubModuleDto;
import com.sgic.internal.defecttracker.project.entities.Module;
import com.sgic.internal.defecttracker.project.entities.SubModule;

public class SubModuleConverter {
	
	private SubModuleConverter() {
	}

	public static SubModuleDto subModuleTosubModuleDto(SubModule subModule) {
		SubModuleDto subModuleDto = new SubModuleDto();

		if (subModule != null) {
			
			subModuleDto.setSubModuleId(subModule.getSubModuleId());
			subModuleDto.setSubModuleName(subModule.getSubModuleName());
			
			return subModuleDto;
	}
		return null;
	}
		public static SubModule subModuleDtoToSubModule(SubModuleDto subModuleDto) {
			SubModule subModule = new SubModule();
			
			subModule.setSubModuleId(subModuleDto.getSubModuleId());;
			subModule.setSubModuleName(subModuleDto.getSubModuleName());
			return subModule;
		}
		
		public static List<SubModuleDto> subModuleToSubModuleDto(List<SubModule> subModuleList) {

			if (subModuleList != null) {
				List<SubModuleDto> lSubModuleDto = new ArrayList<>();
				for (SubModule submodule : subModuleList) {
					SubModuleDto submoduleDto = new SubModuleDto();
					
					submoduleDto.setSubModuleId(submodule.getSubModuleId());
					submoduleDto.setSubModuleName(submodule.getSubModuleName());
					lSubModuleDto.add(submoduleDto);
				}

				return lSubModuleDto;
			}
			return null;

		}

	}

		

