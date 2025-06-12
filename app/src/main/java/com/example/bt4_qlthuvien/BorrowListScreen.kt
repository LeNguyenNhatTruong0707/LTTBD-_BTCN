package com.example.bt4_qlthuvien

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.bt4_qlthuvien.models.BorrowRecord
import com.example.bt4_qlthuvien.models.Student

@Composable
fun BorrowListScreen(students: List<Student>, borrowRecords: List<BorrowRecord>) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Danh sách mượn sách", style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.height(16.dp))

        borrowRecords.forEach { record ->
            val student = students.find { it.id == record.studentId }
            Text(text = "Sinh viên: ${student?.name} - Mã lớp: ${student?.className}")
            Text(text = "Mã sách: ${record.bookId} - Ngày mượn: ${record.borrowDate}")
            Divider(modifier = Modifier.padding(vertical = 8.dp))
        }
    }
}
