package com.example.pertemuan4

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasLayoutUtama(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 60.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.prodi),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.text_black)
        )
        Text(
            text = stringResource(id = R.string.univ),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.text_black)
        )
        Spacer(modifier = Modifier.height(20.dp))
        ProfilCardItem(
            namaRes = R.string.nama_1,
            telpRes = null,
            alamatRes = R.string.alamat_1,
            bgColorRes = R.color.bg_card_bambang,
            alamatColorRes = R.color.text_yellow,
            namaFontFamily = FontFamily.Cursive
        )
        ProfilCardItem(
            namaRes = R.string.nama_2,
            telpRes = R.string.telp_2,
            alamatRes = R.string.alamat_2,
            bgColorRes = R.color.bg_card_gibran,
            alamatColorRes = R.color.text_yellow,
            namaFontFamily = FontFamily.Default
        )
        ProfilCardItem(
            namaRes = R.string.nama_3,
            telpRes = R.string.telp_3,
            alamatRes = R.string.alamat_3,
            bgColorRes = R.color.bg_card_zhilal,
            alamatColorRes = R.color.text_white,
            namaFontFamily = FontFamily.Default
        )
        ProfilCardItem(
            namaRes = R.string.nama_4,
            telpRes = R.string.telp_4,
            alamatRes = R.string.alamat_4,
            bgColorRes = R.color.bg_card_ahmad,
            alamatColorRes = R.color.text_white,
            namaFontFamily = FontFamily.Default
        )
    }
}

@Composable
fun ProfilCardItem(
    namaRes: Int, telpRes: Int? = null, alamatRes: Int, bgColorRes: Int, alamatColorRes: Int, namaFontFamily: FontFamily
) {
    Card(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 24.dp, vertical = 8.dp),
        colors = CardDefaults.cardColors(containerColor = colorResource(id = bgColorRes))
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier.size(60.dp)
            )
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(id = namaRes),
                    fontSize = 22.sp,
                    fontFamily = namaFontFamily,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.text_white)
                )

                if (telpRes != null) {
                    Text(
                        text = stringResource(id = telpRes),
                        fontSize = 14.sp,
                        color = colorResource(id = R.color.text_cyan)
                    )
                    Text(
                        text = stringResource(id = alamatRes),
                        fontSize = 14.sp,
                        color = colorResource(id = alamatColorRes)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.logo_umy),
                        contentDescription = null,
                        modifier = Modifier.size(60.dp)
                    )
                }
            }
        }
    }
}