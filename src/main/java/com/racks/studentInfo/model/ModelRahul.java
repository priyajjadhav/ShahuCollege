package com.racks.studentInfo.model;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="shahucollegestudent")
	public class ModelRahul {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="StudentRollno")
		private long id;
		@Column(name="StudentName")
		private String name;
		@Column(name="StudentEmailId")
		private String emailId;
		@Column(name="StudentMobileNo")
		private long mobileNo;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public long getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(long mobileNo) {
			this.mobileNo = mobileNo;
		}
		public ModelRahul(long id, String name, String emailId, long mobileNo) {
			super();
			this.id = id;
			this.name = name;
			this.emailId = emailId;
			this.mobileNo = mobileNo;
		}
		@Override
		public String toString() {
			return "ModelRahul [id=" + id + ", name=" + name + ", emailId=" + emailId + ", mobileNo=" + mobileNo + "]";
		}
		public ModelRahul() {
			super();
		}
	}

