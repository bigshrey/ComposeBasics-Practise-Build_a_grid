package com.example.courses



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme


import androidx.compose.ui.Modifier


import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import com.example.courses.model.Topic
import com.example.courses.ui.theme.CoursesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoursesTheme {

            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = false)
@Composable
fun GreetingPreview(modifier: Modifier = Modifier) {
    TopicGridItem()
}

@Composable
fun TopicGridItem(modifier: Modifier = Modifier) {
    Card {
        Row {
            Box {
                Image(painter = painterResource(id = R.drawable.photography),
                    contentDescription = null,
                    modifier = Modifier
                        .size(68.dp, 68.dp)
                        .aspectRatio(1f),
                    contentScale = ContentScale.Crop
                )
            }
            Column(modifier = Modifier) {
                Text(text = stringResource(id = R.string.photography),
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(
                        start = 16.dp,
                        top = 16.dp,
                        end = 16.dp,
                        bottom = 8.dp
                    )
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(painter = painterResource(id = R.drawable.ic_grain), contentDescription = null, modifier = modifier.padding(start = 16.dp))
                    Text(text = "321", modifier = modifier.padding(start = 8.dp), style = MaterialTheme.typography.labelMedium)
                }
            }
        }
    }
}