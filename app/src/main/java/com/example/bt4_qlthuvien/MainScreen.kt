package com.example.bt4_qlthuvien

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {
    val sampleBooks = listOf(
        Book(id = 1, title = "Dế Mèn Phiêu Lưu Ký", author = "Tô Hoài", isAvailable = true),
        Book(id = 2, title = "Tuổi thơ dữ dội", author = "Phùng Quán", isAvailable = false),
        Book(id = 3, title = "Tôi thấy hoa vàng trên cỏ xanh", author = "Nguyễn Nhật Ánh", isAvailable = true)
    )

    val sampleStudents = listOf(
        Student(id = 1, name = "Nguyễn Văn A", className = "12A1"),
        Student(id = 2, name = "Trần Thị B", className = "11B3"),
        Student(id = 3, name = "Lê Văn C", className = "10C2")
    )

    val sampleRecords = listOf(
        BorrowRecord(studentId = 1, bookId = 2, borrowDate = "2025-06-10"),
        BorrowRecord(studentId = 2, bookId = 1, borrowDate = "2025-06-11")
    )



    Column(modifier = Modifier.padding(16.dp)) {
        Text("Danh sách sách", style = MaterialTheme.typography.titleLarge)
        BookListScreen(
            Text(
                text = "Danh sách mượn sách",
                style = MaterialTheme.typography.titleLarge
            )
                    BorrowListScreen(students = sampleStudents, borrowRecords = sampleRecords)



        Spacer(modifier = Modifier.height(24.dp))

        Text("Danh sách sinh viên", style = MaterialTheme.typography.titleLarge)
        StudentListScreen(students = sampleStudents)

        Spacer(modifier = Modifier.height(24.dp))

        Text("Danh sách mượn sách", style = MaterialTheme.typography.titleLarge)

    }
}
