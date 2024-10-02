package ir.matin.jetpackcompose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
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

}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

    MyAppTheme {
        MainScreen()


    }
}