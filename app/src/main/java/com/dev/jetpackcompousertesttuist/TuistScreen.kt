package com.dev.jetpackcompousertesttuist


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.BackHand
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.ModeComment
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Repeat
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TuistScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp)
    ) {
        Column {
            MyHeaderClone()
            MyDivider()
            Spacer(modifier = Modifier.size(10.dp))
            MyHeaderTuit(Modifier.padding(horizontal = 10.dp))
            Spacer(modifier = Modifier.size(16.dp))
            MyBody()
        }
    }
}

@Composable
fun MyHeaderClone() {
    Row(Modifier.fillMaxWidth()) {

        Row(
            modifier = Modifier
                .weight(1f)
                .wrapContentHeight()
                .align(Alignment.CenterVertically)
        ) {
            Icon(
                Icons.Default.ArrowBack,
                contentDescription = null,
                modifier = Modifier
                    .size(18.dp)
                    .align(Alignment.CenterVertically)

            )
            Text(
                text = "Tweet clone",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(horizontal = 32.dp)

            )
        }

        Row(
            modifier = Modifier
                .weight(1f)
                .wrapContentHeight()
                .align(Alignment.CenterVertically)
        ) {

        }




    }
    Spacer(modifier = Modifier.size(16.dp))
}

@Composable
fun MyBody() {
    Column(Modifier.fillMaxWidth()) {
        MyText()
        Spacer(modifier = Modifier.size(16.dp))
        MyImageTuist()
        Spacer(modifier = Modifier.size(10.dp))
        MyTimeTuist()
        Spacer(modifier = Modifier.size(10.dp))
        MyDivider()
        Spacer(modifier = Modifier.size(10.dp))
        MyCiteAndLike()
        Spacer(modifier = Modifier.size(10.dp))
        MyDivider()
        Spacer(modifier = Modifier.size(10.dp))
        MyIconsOptions()
        Spacer(modifier = Modifier.size(10.dp))
        MyDivider()

    }
}

@Composable
fun MyIconsOptions() {
    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
        Icon(
            imageVector = Icons.Default.ModeComment,
            contentDescription = "comment",
            modifier = Modifier
                .weight(1f)
                .size(18.dp)
        )
        Icon(
            imageVector = Icons.Default.Repeat,
            contentDescription = "favorite",
            modifier = Modifier
                .weight(1f)
                .size(18.dp)
        )
        Icon(
            imageVector = Icons.Default.Favorite,
            contentDescription = "favorite",
            modifier = Modifier
                .weight(1f)
                .size(18.dp)
        )
        Icon(
            imageVector = Icons.Default.Bookmark,
            contentDescription = "favorite",
            modifier = Modifier
                .weight(1f)
                .size(18.dp)
        )
        Icon(
            imageVector = Icons.Default.Share,
            contentDescription = "favorite",
            modifier = Modifier
                .weight(1f)
                .size(18.dp)
        )

    }
}

@Composable
fun MyCiteAndLike() {
    Row(Modifier.fillMaxWidth()) {
        Text(
            text = "1M",
            fontWeight = FontWeight.Bold,
            fontSize = 13.sp,
            modifier = Modifier.padding(horizontal = 4.dp),
        )
        Text(text = "Cite", fontSize = 13.sp, color = Color(0xFF615F5F))
        Spacer(modifier = Modifier.padding(horizontal = 4.dp))
        Text(
            text = "1.5M",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 4.dp),
            fontSize = 13.sp
        )
        Text(text = "Me gusta", fontSize = 13.sp, color = Color(0xFF615F5F))
    }
}

@Composable
fun MyDivider() {
   Column(Modifier.fillMaxWidth().padding(horizontal = 0.dp)) {
       androidx.compose.material.Divider(
           Modifier
               .background(Color(0XFFF9F9F9))
               .height(1.dp)
               .fillMaxWidth()
       )
   }
}

@Composable
fun MyTimeTuist() {
    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start) {
        Text(text = "7:02 p. m. · 25 abr 23 · ", fontSize = 13.sp, color = Color(0xFF615F5F))
        Text(text = "36.2K", fontWeight = FontWeight.Bold, fontSize = 13.sp)
        Text(
            text = "Visualizaciones",
            modifier = Modifier.padding(horizontal = 8.dp),
            fontSize = 13.sp,
            color = Color(0xFF615F5F)
        )
    }
}

@Composable
fun MyImageTuist() {
    Row(Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "image tuist",
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
                .clip(RoundedCornerShape(16.dp))
        )
    }
}

@Composable
fun MyText() {
    Text(
        text = "En este ejemplo, se utiliza el modificador fillMaxWidth en el componente Row para que ocupe todo el ancho disponible. Luego, se utiliza el modificador weight con un valor de 1 en el componente Column que contiene la imagen y el nombre del usuario, lo que hace que ocupe todo el espacio disponible en la fila y empuja el icono hacia la derecha.",
        textAlign = TextAlign.Left,
        fontSize = 12.sp,
        lineHeight = 16.sp
    )
}

@Composable
fun MyHeaderTuit(modifier: Modifier) {
    Row(
        Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.weight(1f),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "image",
                modifier = Modifier
                    .size(38.dp)
                    .clip(CircleShape)
            )

            Column(Modifier.padding(horizontal = 12.dp, vertical = 1.dp)) {
                Text(text = "Cristofer Jaimez", fontWeight = FontWeight.Bold, fontSize = 13.sp)
                Text(
                    text = "@CristoJaimez",
                    fontWeight = FontWeight.Normal,
                    fontSize = 13.sp,
                    lineHeight = 16.sp,
                    color = Color(0xFF615F5F),
                )
            }


        }

        Row(
            modifier = Modifier
                .weight(1f)
                .size(18.dp),
            horizontalArrangement = Arrangement.End,

            ) {
            Icon(
                imageVector = Icons.Default.MoreVert,
                contentDescription = "menu",
                tint = Color(0xFFAFADAD),
            )
        }
    }
}


