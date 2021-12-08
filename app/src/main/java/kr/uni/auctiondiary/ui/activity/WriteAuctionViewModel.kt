package kr.uni.auctiondiary.ui.activity

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.location.Geocoder
import android.location.LocationManager
import androidx.core.app.ActivityCompat
import androidx.databinding.ObservableField
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.google.android.gms.maps.model.LatLng
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kr.uni.auctiondiary.util.location.MyLocation
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
        val locationLoader = MyLocation(context)
        myLocation.set(locationLoader.get())
    }
}