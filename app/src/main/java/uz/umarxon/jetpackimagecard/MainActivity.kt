package uz.umarxon.jetpackimagecard

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White),
            ) {

                val painter = painterResource(id = R.drawable.ic_baseline_supervised_user_circle_24)
                val painter2 = painterResource(id = R.drawable.ic_baseline_support_agent_24)
                val painter3 = painterResource(id = R.drawable.ic_baseline_verified_24)
                val painter4 = painterResource(id = R.drawable.ic_baseline_attach_money_24)

                Column(verticalArrangement = Arrangement.Center) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .padding(16.dp)
                        ) {
                            ImageCard(
                                painter = painter,
                                contentDescription = "This is ImageCard example",
                                title = "Jetpack Image Card 1",
                                modifier = Modifier.clickable(
                                    interactionSource = remember { MutableInteractionSource() },
                                    indication = rememberRipple(bounded = true),
                                    onClick = {
                                        Toast.makeText(
                                            this@MainActivity,
                                            "ImageCard 1",
                                            Toast.LENGTH_SHORT
                                        )
                                            .show()
                                    }
                                ),
                                Color.Red)
                        }

                        Box(
                            modifier = Modifier
                                .fillMaxWidth(1f)
                                .padding(16.dp)
                        ) {
                            ImageCard(
                                painter = painter2,
                                contentDescription = "This is ImageCard example",
                                title = "Jetpack Image Card 2",
                                modifier = Modifier.clickable(
                                    interactionSource = remember { MutableInteractionSource() },
                                    indication = rememberRipple(bounded = true),
                                    onClick = {
                                        Toast.makeText(
                                            this@MainActivity,
                                            "ImageCard 2",
                                            Toast.LENGTH_SHORT
                                        )
                                            .show()
                                    }
                                ),
                                Color.Magenta)
                        }
                    }
                    Row(
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .padding(16.dp)
                        ) {
                            ImageCard(
                                painter = painter3,
                                contentDescription = "This is ImageCard example",
                                title = "Jetpack Image Card 3",
                                modifier = Modifier.clickable(
                                    interactionSource = remember { MutableInteractionSource() },
                                    indication = rememberRipple(bounded = true),
                                    onClick = {
                                        Toast.makeText(
                                            this@MainActivity,
                                            "ImageCard 3",
                                            Toast.LENGTH_SHORT
                                        )
                                            .show()
                                    }
                                ),
                                Color.Green
                            )
                        }
                        Box(
                            modifier = Modifier
                                .fillMaxWidth(1f)
                                .padding(16.dp)
                        ) {
                            ImageCard(
                                painter = painter4,
                                contentDescription = "This is ImageCard example",
                                title = "Jetpack Image Card 4",
                                modifier = Modifier.clickable(
                                    interactionSource = remember { MutableInteractionSource() },
                                    indication = rememberRipple(bounded = true),
                                    onClick = {
                                        Toast.makeText(
                                            this@MainActivity,
                                            "ImageCard 4",
                                            Toast.LENGTH_SHORT
                                        )
                                            .show()
                                    }
                                ),
                                Color.Yellow)
                        }
                    }
                }

            }

        }
    }
}


@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier,
    color: Color
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Box(
            modifier = Modifier
                .height(200.dp)
                .background(color)
        ) {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.FillWidth
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black
                            ),
                            startY = 300f
                        )
                    )
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(title, style = TextStyle(color = Color.White, fontSize = 16.sp))
            }
        }

    }

}
