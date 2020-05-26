package mx.edu.ittepic.ladm_u4_p2_xaviermonroy

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo(p: MainActivity) : View(p) {
    var posX = 300f // pos x
    var dia = true  // control de escenario

    override fun onDraw(c : Canvas) {
        var p = Paint()

        if(dia) {
            //dibujar cielo
            c.drawColor(Color.rgb(24, 182, 221))

            //dibujar sol
            p.color = Color.YELLOW
            c.drawCircle(170f, 170f, 150f, p)

            //dibujar nubes
            p.color = Color.rgb(255,255,255)
            p.style = Paint.Style.FILL
            c.drawCircle(550f, 150f, 80f, p)
            c.drawCircle(620f, 152f, 80f, p)
            c.drawCircle(620f, 100f, 80f, p)
            c.drawCircle(620f, 196f, 80f, p)
            c.drawCircle(690f, 150f, 80f, p)
            c.drawCircle(690f, 100f, 80f, p)
            c.drawCircle(690f, 196f, 80f, p)
            c.drawCircle(760f, 148f, 80f, p)
            c.drawCircle(760f, 100f, 80f, p)
            c.drawCircle(760f, 196f, 80f, p)
            c.drawCircle(830f, 148f, 80f, p)

            c.drawCircle(150f, 370f, 80f, p)
            c.drawRect(160f,300f,415f,450f,p)
            c.drawCircle(420f, 390f, 60f, p)
            c.drawCircle(350f, 320f, 75f, p)
            c.drawCircle(230f, 290f, 95f, p)

            //dibujar tierra
            p.color = Color.rgb(205, 190, 104)
            p.style = Paint.Style.FILL
            c.drawCircle(500f, 3000f, 1500f, p)
        } else {
            //dibujar cielo
            c.drawColor(Color.rgb( 0, 0, 0))

            //dibujar luna
            p.color = Color.WHITE
            p.style = Paint.Style.FILL
            c.drawCircle(170f, 170f, 150f, p)

            // Nube
            p.color = Color.rgb(173, 183, 184)
            p.style = Paint.Style.FILL
            c.drawCircle(70f, 150f, 60f, p)
            c.drawCircle(120f, 152f, 60f, p)
            c.drawCircle(170f, 150f, 60f, p)

            p.color = Color.rgb(214, 222, 216)
            p.style = Paint.Style.FILL
            c.drawCircle(170f, 208f, 60f, p)
            c.drawCircle(220f, 208f, 60f, p)
            c.drawCircle(270f, 208f, 60f, p)
            c.drawCircle(310f, 208f, 60f, p)

            //Imagen de esfera
            c.drawBitmap(BitmapFactory.decodeResource(resources, R.drawable.esfera), 0f, 400f, p)

            c.drawCircle(150f, 1370f, 80f, p)
            c.drawRect(160f,1300f,415f,1450f,p)
            c.drawCircle(420f, 1390f, 60f, p)
            c.drawCircle(350f, 1320f, 75f, p)
            c.drawCircle(230f, 1290f, 95f, p)

            p.color = Color.rgb(214, 222, 216)
            p.style = Paint.Style.FILL
            c.drawCircle(650f, 1750f, 80f, p)
            c.drawCircle(720f, 1752f, 80f, p)
            c.drawCircle(720f, 1700f, 80f, p)
            c.drawCircle(720f, 1796f, 80f, p)
            c.drawCircle(790f, 1750f, 80f, p)
            c.drawCircle(790f, 1700f, 80f, p)
            c.drawCircle(790f, 1796f, 80f, p)
            c.drawCircle(860f, 1748f, 80f, p)
            c.drawCircle(860f, 1700f, 80f, p)
            c.drawCircle(860f, 1796f, 80f, p)
            c.drawCircle(930f, 1748f, 80f, p)

            p.color = Color.rgb(173, 183, 184)
            p.style = Paint.Style.FILL
            c.drawCircle(450f, 1720f, 80f, p)
            c.drawCircle(520f, 1722f, 80f, p)
            c.drawCircle(520f, 1670f, 80f, p)
            c.drawCircle(520f, 1766f, 80f, p)
            c.drawCircle(590f, 1720f, 80f, p)
            c.drawCircle(590f, 1670f, 80f, p)
            c.drawCircle(590f, 1766f, 80f, p)
            c.drawCircle(660f, 1718f, 80f, p)
            c.drawCircle(660f, 1670f, 80f, p)
            c.drawCircle(660f, 1766f, 80f, p)
            c.drawCircle(730f, 1718f, 80f, p)

            //dibujar estrellas
            p.color = Color.WHITE
            p.style = Paint.Style.FILL
            c.drawCircle(80f, 342f, 8f, p)
            c.drawCircle(180f, 490f, 8f, p)
            c.drawCircle(110f, 642f, 8f, p)
            c.drawCircle(260f, 350f, 8f, p)
            c.drawCircle(320f, 520f, 8f, p)
            c.drawCircle(430f, 280f, 8f, p)
            c.drawCircle(475f, 142f, 8f, p)
            c.drawCircle(675f, 262f, 8f, p)
            c.drawCircle(700f, 80f, 8f, p)
            c.drawCircle(930f, 120f, 8f, p)
            c.drawCircle(975f, 288f, 8f, p)
            c.drawCircle(1025f, 500f, 8f, p)

            //Imagen de Shenlong
            c.drawBitmap(BitmapFactory.decodeResource(resources, R.drawable.shenlong), 400f, 200f, p)
        }

        //Imagen de Goku
        c.drawBitmap(BitmapFactory.decodeResource(resources, R.drawable.goku), posX, 700f, p)
    }
}