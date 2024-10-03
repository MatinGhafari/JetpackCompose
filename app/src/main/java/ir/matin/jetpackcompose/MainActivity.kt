package ir.matin.jetpackcompose

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelProvider
import ir.matin.jetpackcompose.ui.theme.MyAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Use Custom Theme In our App
            MyAppTheme {
                MainScreen()


            }

        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    Button(onClick = { /*TODO*/ } , modifier = Modifier
        .padding(8.dp)
        .width(100.dp)) {

        Text(text = "Hello")
        
    }

    Card {



    }

}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

    MyAppTheme {
        MainScreen()


    }
}