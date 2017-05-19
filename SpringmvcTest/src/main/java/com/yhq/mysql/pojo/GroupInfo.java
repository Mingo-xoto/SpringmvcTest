package com.yhq.mysql.pojo;

import java.io.Serializable;
import java.util.List;

public class GroupInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4436084738166806259L;

	private Integer id;

	private String groupNo;

	private List<EntryPeople> entryPeopleList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGroupNo() {
		return groupNo;
	}

	public void setGroupNo(String groupNo) {
		this.groupNo = groupNo == null ? null : groupNo.trim();
	}

	public List<EntryPeople> getEntryPeopleList() {
		return entryPeopleList;
	}

	public void setEntryPeopleList(List<EntryPeople> entryPeopleList) {
		this.entryPeopleList = entryPeopleList;
	}

//	@Override
//	public String toString() {		
//		return JSONObject.fromObject(this).toString();
//	}
}