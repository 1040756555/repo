package com.zhiyou.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin implements Serializable{

	private Integer admin_id;
	private String accounts;
	private String password;
	private String admin_remark;
}
