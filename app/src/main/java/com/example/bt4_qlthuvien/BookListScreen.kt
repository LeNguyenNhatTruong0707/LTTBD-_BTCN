package com.example.bt4_qlthuvien

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BookListScreen(books: List<Book>) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        Text(
            text = "Danh sách sách",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        LazyColumn {
            items(books) { book ->
                BookItem(book = book)
                Divider()
            }
        }
    }
}

@Composable
fun BookItem(book: Book) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)) {
        Text(text = "📘 Tựa đề: ${book.title}", fontWeight = FontWeight.SemiBold)
        Text(text = "✍️ Tác giả: ${book.author}")
        Text(
            text = if (book.isAvailable) "✅ Có sẵn" else "❌ Đã mượn",
            color = if (book.isAvailable) Color.Green else Color.Red
        )
    }
}
