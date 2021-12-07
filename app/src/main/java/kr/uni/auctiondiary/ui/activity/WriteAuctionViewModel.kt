package kr.uni.auctiondiary.ui.activity

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.location.Geocoder
import android.location.LocationManager
import androidx.core.app.ActivityCompat
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.google.android.gms.maps.model.LatLng
import dagger.hilt.android.lifecycle.HiltViewModel
import java.util.*
import javax.inject.Inject

@HiltViewModel
class WriteAuctionViewModel @Inject constructor() : ViewModel() {

    val myLocation: ObservableField<String> = ObservableField("주소를 표시할 수 없습니다.")

    fun checkFineLocationPermission(context: Context): Boolean = ActivityCompat.checkSelfPermission(
        context, Manifest.permission.ACCESS_FINE_LOCATION
    ) != PackageManager.PERMISSION_GRANTED

    fun checkCoarseLocationPermission(context: Context): Boolean =
        ActivityCompat.checkSelfPermission(
            context, Manifest.permission.ACCESS_COARSE_LOCATION
        ) != PackageManager.PERMISSION_GRANTED


    @SuppressLint("MissingPermission")
    fun getLocation(context: Context) {
        val locationManager = context.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        val loc =
            if (locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER) != null) {
                locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER)
            } else {
                locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER)
            }
        myLocation.set(
            if (loc != null) {
                val location = LatLng(loc.latitude, loc.longitude)
                getAddress(context, location)
            } else {
                "주소정보 가져올 수 없음"
            }
        )

    }

    private fun getAddress(context: Context, position: LatLng): String {
        val geoCoder = Geocoder(context, Locale.KOREA)
        return geoCoder.getFromLocation(position.latitude, position.longitude, 1).first()
            .getAddressLine(0)
    }
}