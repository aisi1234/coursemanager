package com.kth.groups.coursemanager.database.table;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Table_UserMsg")
public class UserEntity {
    @PrimaryKey
    @NonNull public String student_ID;

    public String password;

    public String name;

    public String sex;

    public String school;

    public String department;

    public String major;

    public String grade;

}
