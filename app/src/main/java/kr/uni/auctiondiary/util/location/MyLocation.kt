package kr.uni.auctiondiary.util.location

import android.annotation.SuppressLint
import android.content.Context
import android.location.Geocoder
import android.location.Location
import android.location.LocationManager
import androidx.databinding.ObservableField
import com.google.android.gms.maps.model.LatLng
import dagger.hilt.android.qualifiers.ApplicationContext
import java.lang.Exception
import java.util.*
import javax.inject.Inject

class MyLocation constructor(private val context: Context) {

    private lateinit var locationManager: LocationManager

    fun get(): String {
        setLocationManager()
        return setMyLocation(getLastLocation())
    }

    private fun setLocationManager() {

        locationManager = context.getSystemService(Context.LOCATION_SERVICE) as LocationManager
    }

    @SuppressLint("MissingPermission")
    private fun getLastLocation(): Location? =
        if (locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER) != null) {
            locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER)
        } else {
            locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER)
        }

    private fun setMyLocation(loc: Location?): String {
        return if (loc != null) {
            val latlng = LatLng(loc.latitude, loc.longitude)
            return getAddress(latlng)
        } else {
            "주소정보 가져올 수 없음"
        }
    }

    private fun getAddress(position: LatLng): String {
        val geoCoder = Geocoder(context, Locale.KOREA)
        var addr = "주소 오류"

        try {
            addr = geoCoder.getFromLocation(position.latitude, position.longitude, 1).first()
                .getAddressLine(0)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return addr
    }
}