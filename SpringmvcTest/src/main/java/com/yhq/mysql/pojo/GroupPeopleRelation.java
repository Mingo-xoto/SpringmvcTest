package com.yhq.mysql.pojo;


public class GroupPeopleRelation {
	private Integer id;
	private GroupInfo groupInfo;
	private EntryPeople entryPeople;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public GroupInfo getGroupInfo() {
		return groupInfo;
	}

	public void setGroupInfo(GroupInfo groupInfo) {
		this.groupInfo = groupInfo;
	}

	public EntryPeople getEntryPeople() {
		return entryPeople;
	}

	public void setEntryPeople(EntryPeople entryPeople) {
		this.entryPeople = entryPeople;
	}

}