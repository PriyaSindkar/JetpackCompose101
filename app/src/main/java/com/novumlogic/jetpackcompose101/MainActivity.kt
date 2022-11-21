package com.novumlogic.jetpackcompose101

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.novumlogic.jetpackcompose101.ui.theme.JetpackCompose101Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackCompose101Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    ColumnExample("Android")
//                    TextExample("Android")
                    ButtonExample()
                }
            }
        }
    }
}

@Composable
fun TextExample(name: String) {
    Text(
        text = "Hello $name!",
        color = colorResource(id = R.color.purple_200),
        modifier = Modifier.clickable {

        },
        style = TextStyle(fontStyle = FontStyle.Italic, fontSize = 16.sp)
    )
}

@Composable
fun ColumnExample(name: String) {
    Column {
        Text(text = "Hello,")
        Text(text = name)
    }
}

@Composable
fun RowExample(name: String) {
    Row {
        Text(text = stringResource(id = R.string.app_name))
        Text(text = name)
    }
}

@Composable
fun BoxExample() {
    Box {
        Image(painterResource(id = R.drawable.user), contentDescription = "User Avatar")
        Text(text = "John Doe")
        Icon(
            Icons.Rounded.Edit, contentDescription = "Menu Localized description",
            modifier = Modifier.align(Alignment.BottomEnd)
        )
    }
}

@Composable
fun ButtonExample(/*context: Context*/) {
    Box {
        Button(
            onClick = {
//            Toast.makeText(context, "Button clicked", Toast.LENGTH_LONG).show()
            },
            modifier = Modifier
//            .size(40.dp, 30.dp)
                .fillMaxSize()
                .padding(8.dp)
        ) {
            Text(text = "Click Me! Click Me! Click Me!Click Me!Click Me!")
        }

    }
}

@Composable
fun TextFieldExample() {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        value = text,
        onValueChange = { newText ->
            text = newText
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackCompose101Theme {
        ButtonExample()
    }
}