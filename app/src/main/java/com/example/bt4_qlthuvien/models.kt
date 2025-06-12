package com.example.bt4_qlthuvien.models

data class Student(
    val id: Int,
    val name: String,
    val className: String
)

data class BorrowRecord(
    val studentId: Int,
    val bookId: Int,
    val borrowDate: String
)
