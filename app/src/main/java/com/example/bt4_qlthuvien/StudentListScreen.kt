package com.example.bt4_qlthuvien

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StudentListScreen(students: List<Student>) {
    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(students) { student ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
                elevation = CardDefaults.cardElevation(4.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("ID: ${student.id}", style = MaterialTheme.typography.bodyMedium)
                    Text("Họ tên: ${student.name}", style = MaterialTheme.typography.titleMedium)
                    Text("Lớp: ${student.className}", style = MaterialTheme.typography.bodySmall)
                }
            }
        }
    }
}
