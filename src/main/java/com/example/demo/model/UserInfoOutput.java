package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInfoOutput {
  private String emp_id;
  private String username;
  private String password;
  private String fname;
  private String mname;
  private String lname;
  private String status_code;
  private String position_name;
  private String email;
  private String section_name;
  private String dept_name;
  private String title;
  private String img_src;
  private int del_flag;
  private int section_id;
  private int dept_id;
  private int position_id;
}
