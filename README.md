# 📝 CLI Todo App

A simple command-line based Todo List application built in Java.  
This app allows you to add, remove, complete, display, save, and load tasks through intuitive terminal commands.

## 🚀 Features

- Add tasks with ID and description
- Remove tasks by ID
- Mark tasks as completed
- View all tasks with status
- Save tasks to a `.txt` file
- Load tasks from file on startup

CLI-todo-app/
├── Main.java # Entry point, handles CLI input
├── Task.java # Task model (id, name, status)
├── TaskManager.java # Handles logic for task operations and file I/O
├── tasks.txt # Saved tasks (auto-generated after saving)
└── README.md # Project instructions

## 📘 Command Reference

| Command                  | Description                            |
|--------------------------|----------------------------------------|
| `add <id> "task name"`   | Add a new task                         |
| `removetask <id>`        | Remove a task by ID                    |
| `taskcomplete <id>`      | Mark a task as completed               |
| `display`                | Show all current tasks                 |
| `save`                   | Save all tasks to `tasks.txt` file     |
| `exit`                   | Exit the application                   |
