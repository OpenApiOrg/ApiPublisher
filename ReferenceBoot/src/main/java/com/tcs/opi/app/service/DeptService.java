package com.tcs.opi.app.service;

import org.springframework.stereotype.Service;

import com.tcs.opi.app.domain.Department;

@Service
public class DeptService {

//    @Autowired
//    private UserMapper deptMapper;

    public int addDept(Department deptToAdd) {
//        return deptMapper.addUser(deptToAdd);
    	
    	return 0;
    }

    public Department getDept(int deptId) {
//        return deptMapper.getUser(deptId);
    	
    	//TODO: Change this
    	return new Department();
    }
}