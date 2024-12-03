package com.hfad.bookstoreapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.hfad.bookstoreapp.ui.theme.BookStoreAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fs = Firebase.firestore

        // enableEdgeToEdge()
        // setContent {
        //     BookStoreAppTheme {
        //         Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        //            Greeting(
        //                name = "Android",
        //                modifier = Modifier.padding(innerPadding)
        //            )
        //        }
        //    }
        // }
    }
}

@Composable
fun MainScreen() {
    val fs = Firebase.firestore


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.8f)
        ) {

        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {
            fs.collection("books")
                .document().set(mapOf("name" to "My fav book"))
        }) {
            Text(
                text = "Add Book"
            )
        }

    }

}

