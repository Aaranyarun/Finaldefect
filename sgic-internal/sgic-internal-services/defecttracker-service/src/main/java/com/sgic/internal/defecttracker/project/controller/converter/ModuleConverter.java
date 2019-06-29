package com.sgic.internal.defecttracker.project.controller.converter;

import java.util.ArrayList;
import java.util.List;

import com.sgic.internal.defecttracker.project.controller.dto.ModuleDto;
import com.sgic.internal.defecttracker.project.entities.Module;

public class ModuleConverter {

	
	private ModuleConverter() {
	}

	public static ModuleDto moduleToModuleDto(Module module) {
		ModuleDto moduleDto = new ModuleDto();

		if (module != null) {
			moduleDto.setModuleId(module.getModuleId());
			moduleDto.setModuleName(module.getModuleName());
			return moduleDto;
		}
		return null;
	}
	public static Module moduleDtoToModule(ModuleDto moduleDto) {
		Module module = new Module();  
		
		module.setModuleId(moduleDto.getModuleId());
		module.setModuleId(moduleDto.getModuleName());
		return module;
	}
	
	public static List<ModuleDto> moduleToModuleDto(List<Module> moduleList) {

		if (moduleList != null) {
			List<ModuleDto> lModuleDto = new ArrayList<>();
			for (Module module : moduleList) {
				ModuleDto moduleDto = new ModuleDto();
				
				moduleDto.setModuleId(module.getModuleId());
				moduleDto.setModuleName(module.getModuleName());
				lModuleDto.add(moduleDto);
			}

			return lModuleDto;
		}
		return null;

	}

}
