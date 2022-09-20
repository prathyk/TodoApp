package com.todo.TodoApp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "todo")
public class TodoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "username")
    private String userName;

//    @Size(min = 10, message = "Enter at least 10 Characters...")
    private String description;

    private Date targetDate;

    public TodoItem(String user, String desc, Date targetDate, boolean isDone) {
        super();
        this.userName = user;
        this.description = desc;
        this.targetDate = targetDate;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }
}
