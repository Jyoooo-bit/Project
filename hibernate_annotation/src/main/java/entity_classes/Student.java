package entity_classes;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="my_stu_table")
public class Student {
	@Id
	@Column(name="stu_id")
	private Integer id;
	
	@Column(name="stu_name")
	private String name;
	@Column(name="stu_percentage")
	private Double percentage;

	@CreationTimestamp
	private LocalDateTime create_time;
	@UpdateTimestamp
	private LocalDateTime update_time;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int i, String string, double d) {
		// TODO Auto-generated constructor stub
	}
	public Student(Integer id, String name, Double percentage) {
	    this.id = id;
	    this.name = name;
	    this.percentage = percentage;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	public LocalDateTime getCreate_time() {
		return create_time;
	}
	public void setCreate_time(LocalDateTime create_time) {
		this.create_time = create_time;
	}
	public LocalDateTime getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(LocalDateTime update_time) {
		this.update_time = update_time;
	}
	


	

}
