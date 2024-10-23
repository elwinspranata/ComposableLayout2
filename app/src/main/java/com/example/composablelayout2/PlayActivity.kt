package com.example.composablelayout2

import android.preference.PreferenceActivity.Header
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.w3c.dom.Text



@Preview(showBackground = true)
@Composable
fun PlayActivity() {
    Column{modifier = Modifier.fillMaxSize()){
         HeaderSection(){
             Text(text = "Kepada YTH,", modifier = Modifier.padding(16.dp))
             Text(text = "Elwins Pranata", modifier = Modifier.padding(start = 16.dp))
             Spacer(modifier = Modifier.size(40.dp))
             DetailSurat(
                 judul = "Nama",
                 isinya = "Elwins Pranata"
             )
             DetailSurat(
                 judul = "Alamat",
                 isinya = "Kota Bandung,"
             )
             DetailSurat(
                 judul = "No Telp",
                 isinya = "0987654"
             )
             DetailSurat(
                 judul = "Kepentingan",
                 isinya = "Detail"
         }
            Box(
                modifier = Modifier.fillMaxWidth()
                    .background(color = Color.Gray)
                    .padding(15.dp)


            ) {
                Row {
                    Column {
                        Text(
                            text = "DIY",
                            color = Color.Blue
                        )

                        Text(
                            text = "Fax : 087732690",
                            color = Color.White
                        )

                    }
                    Box(
                        Image(
                            painter = painterResource(id = R.drawable.ucl),
                            contentDescription = null,
                            modifier = Modifier
                                .size(100.dp)
                                .clip(CircleShape)
                        )


                                      contentDescription = null
                                      )
                }
            }
        }




