package com.example.starverse.Entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Chat_Card")
public class ChatCard {

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "username")
    @androidx.annotation.NonNull
    private String name;

    @ColumnInfo(name = "status")
    private Integer status;

    @ColumnInfo(name = "preview")
    private String preview;

    @ColumnInfo(name = "last_active")
    private Integer lastActive;
}
