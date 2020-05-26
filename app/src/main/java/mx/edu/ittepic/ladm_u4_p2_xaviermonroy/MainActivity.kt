package mx.edu.ittepic.ladm_u4_p2_xaviermonroy

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), SensorEventListener {
    lateinit var lienzo : Lienzo
    lateinit var sensorManager : SensorManager

    override fun onCreate(savedInstanceState: Bundle?) {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager

        //acelerometro
        sensorManager.registerListener(this,
            sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL)

        //sensor de proximidad
        sensorManager.registerListener(this,
            sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY), SensorManager.SENSOR_DELAY_NORMAL)

        //llamada a la clase lienzo
        super.onCreate(savedInstanceState)
        lienzo = Lienzo(this)
        setContentView(lienzo!!)
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) { }

    //Detectar cambio en los sensores
    override fun onSensorChanged(event: SensorEvent) {
        var posX = event.values[0]

        //Movimiento de imagen
        if(event.sensor.type == Sensor.TYPE_ACCELEROMETER) {
            if(lienzo.posX >= 1050f){
                lienzo.posX = -600f
            }else if (lienzo.posX <= -600f){
                lienzo.posX = 1050f
            }

            lienzo.posX = lienzo.posX + (-posX)
        }

        //Cambiar escenario con el sensor de proximidad
        if(event.sensor.type == Sensor.TYPE_PROXIMITY) {
            lienzo.dia = (event.values[0] >= 5f)
        }

        lienzo.invalidate()
    }
}
