package kr.uni.auctiondiary.ui.activity

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.location.*
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermission
import dagger.hilt.android.AndroidEntryPoint
import kr.uni.auctiondiary.R
import kr.uni.auctiondiary.databinding.ActivityWriteAuctionBinding
import kr.uni.auctiondiary.util.BaseActivity
import java.util.*
import javax.inject.Inject

@AndroidEntryPoint
class WriteAuctionActivity : BaseActivity() {

    private lateinit var binding: ActivityWriteAuctionBinding
    private val viewModel: WriteAuctionViewModel by viewModels()
    private val TAG = WriteAuctionActivity::class.java.simpleName


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_write_auction)
        binding.apply {
            activity = this@WriteAuctionActivity
            lifecycleOwner = this@WriteAuctionActivity
            vm = viewModel
        }
        permissionCheck()
    }

    private fun permissionCheck() {
        if (viewModel.checkCoarseLocationPermission(this@WriteAuctionActivity) &&
            viewModel.checkFineLocationPermission(this@WriteAuctionActivity)
        ) {
            tedPermission()
        } else {
            viewModel.getLocation(this@WriteAuctionActivity)
        }
    }


    private fun tedPermission() {
        val permissionListener = object : PermissionListener {
            override fun onPermissionGranted() {
                viewModel.getLocation(this@WriteAuctionActivity)
            }

            override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
                Toast.makeText(
                    this@WriteAuctionActivity,
                    "설정에서 권한을 허가 해주세요.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        TedPermission.with(this)
            .setPermissionListener(permissionListener)
            .setRationaleMessage("서비스 사용을 위해서 몇가지 권한이 필요합니다.")
            .setDeniedMessage("[설정] > [권한] 에서 권한을 설정할 수 있습니다.")
            .setPermissions(
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION
            )
            .check()
    }


}