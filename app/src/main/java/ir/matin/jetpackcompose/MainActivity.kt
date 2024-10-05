package ir.matin.jetpackcompose

import android.annotation.SuppressLint
import android.content.ClipData.Item
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelProvider
import coil.compose.AsyncImage
import ir.matin.jetpackcompose.ui.ItemList
import ir.matin.jetpackcompose.ui.itemList2
import ir.matin.jetpackcompose.ui.theme.MyAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Use Custom Theme In our App
            MyAppTheme {
                MainScreen(itemList2)


            }

        }
    }
}

@Composable
fun ItemList(itemList: ItemList) {
    Card(
        modifier = Modifier
            .padding(top = 8.dp)
            .size(150.dp, 70.dp)
    ) {


        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // use coil 
            AsyncImage(model = itemList.image, contentDescription = null , modifier = Modifier.size(50.dp ,50.dp).padding(4.dp))

            Text(text = itemList.title)


        }


    }


}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(data: List<ItemList>) {
    Surface(modifier = Modifier.fillMaxSize(), color = Color.Gray) {
        LazyColumn(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(data) {
                ItemList(itemList = it)


            }
        }


    }


}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

    MyAppTheme {

        MainScreen(itemList2)

    }
}