package kg.mega.employeedirectory.controllers;

import kg.mega.employeedirectory.models.dtos.EmployeeSaveDto;
import kg.mega.employeedirectory.services.SaveEmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/employee/save")

public class SaveEmployeeController {
    private final SaveEmployeeService saveEmployeeService;

    @PostMapping("/saveEmployee")
    public ResponseEntity<?> saveEmployee(@Valid @RequestBody EmployeeSaveDto employeeSaveDto){
        return saveEmployeeService.saveEmployee(employeeSaveDto);
    }
}
