package com.example.luhlimonada

import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.node.modifierElementOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.luhlimonada.ui.theme.LuhLimonadaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LuhLimonadaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                           limoeiro()
                }
            }
        }
    }
}

@Preview
@Composable
fun limoeiro(){

    var photo = 1

    when (photo){

        1-> Conteudo(
            R.string.limoeira,
            R.drawable.limoeiro,
            clickImage =
        )
        2-> Conteudo(
            R.string.limao,
            R.drawable.limao_expremer
        )
        3-> Conteudo(
            R.string.limonada,
            R.drawable.limonada
        )
        4-> Conteudo(
            R.string.vazio,
            R.drawable.limao_recomecar
        )

    }

}

@Composable
fun Conteudo(recursoTextoId:Int, recursoImagemId: Int, clickImage:() ->Unit){
    Column  (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = stringResource(recursoTextoId)
            , fontSize =  30.sp
        )

        Image(
            painter = painterResource(id =recursoImagemId) ,
            contentDescription = null,
            modifier = Modifier
                .size(350.dp)
                .border(
                    BorderStroke(4.dp, Color.Cyan),
                    RoundedCornerShape(10.dp)
                )
                .clickable(onClick = )

        )


    }

}