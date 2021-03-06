package com.example.securitydemo.service.mapper;

import com.example.securitydemo.common.base.BaseMapper;
import com.example.securitydemo.domain.User;
import com.example.securitydemo.service.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",uses = {RoleSmallMapper.class,DeptMapper.class},unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper extends BaseMapper<UserDTO, User> {
}
