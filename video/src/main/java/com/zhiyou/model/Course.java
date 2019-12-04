package com.zhiyou.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course implements Serializable{

	private Integer id;
	private String course_title;
	private String course_desc;
	private Integer subject_id;
}
