package com.example.employeemanagementdepartmentsv.service.impl;

import com.example.employeemanagementdepartmentsv.dto.DeleteResponseDto;
import com.example.employeemanagementdepartmentsv.dto.EmployeeDto;
import com.example.employeemanagementdepartmentsv.dto.ResponseDto;
import com.example.employeemanagementdepartmentsv.entity.Employee;
import com.example.employeemanagementdepartmentsv.repository.EmployeeRepo;
import com.example.employeemanagementdepartmentsv.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepo employeeRepo;
    private final ModelMapper modelMapper;
    @Override
    public ResponseDto addEmployee(EmployeeDto employeeDto) {


        Employee employee = employeeRepo.save(modelMapper.map(employeeDto, Employee.class));
        return new ResponseDto(employee.getEmp_id(),
                employee.getEmail(),
                employee.getDep_id(),
                employee.getRole());

    }

    @Override
    public List<EmployeeDto> getEmployees() {
        List<Employee> employeeList = employeeRepo.findAll();
        return modelMapper.map(employeeList,new TypeToken<List<EmployeeDto>>(){}.getType());
    }

    @Override
    public DeleteResponseDto deleteEmployee(Long id) {
        if (employeeRepo.existsById(id)){
            Optional<Employee> employee = employeeRepo.findById(id);
            employeeRepo.deleteById(id);
            return new DeleteResponseDto(employee.get().getEmp_id(), "Delete Successful");

        }
        return new DeleteResponseDto(null,"Employee Not Exits");
    }

    @Override
    public EmployeeDto findById(Long id) {
        return modelMapper.map(employeeRepo.findById(id), EmployeeDto.class);
    }

    @Override
    public List<EmployeeDto> findByFirstName(String firstName) {
        List<Employee> employeeList = employeeRepo.findAllByFirstName(firstName);
        return modelMapper.map(employeeList,new TypeToken<List<EmployeeDto>>(){}.getType());
    }
}
