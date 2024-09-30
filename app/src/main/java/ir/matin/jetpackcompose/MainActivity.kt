package ir.matin.jetpackcompose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ir.matin.jetpackcompose.ui.theme.JetpackComposeTheme

val names = arrayListOf("matin", "ali", "sajjad", "mohammad", "mina", "amir")

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MainScreen()

        }
    }
}

@Composable
fun MainScreen() {
    //state
    val namesState = remember {
        mutableStateListOf<String>(
            "matin",
            "ali",
            "sajjad",
            "mohammad",
            "mina",
            "amir"
        )
    }

    //create state for TextField
    val textFieldState = remember {  mutableStateOf("") }

    Surface(modifier = Modifier.fillMaxSize()) {

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            StudentShowName(namesState, { namesState.add(textFieldState.value) } ,
                textFieldState.value , { textFieldState.value=it  }
                )


        }
    }
}

@SuppressLint("RememberReturnType")
@Composable

//get data from parent
fun StudentShowName(
    names: List<String>, onButtonClicked: () -> Unit,
    textFieldValue: String, onTextFieldValueChanged: (String) -> Unit,
) {


    names.forEach {
        Text(text = it)
    }
    Button(onClick = onButtonClicked) {
        Text(text = "add item")
    }
    //create textField
    TextField(value = textFieldValue, onValueChange =onTextFieldValueChanged)


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MainScreen()
}