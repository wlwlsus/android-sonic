package com.dontsc.sonicapplication.presentation.view.base

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.RelativeSizeSpan
import android.text.style.StyleSpan
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.RadioButton
import androidx.annotation.IdRes
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.DialogFragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.dontsc.sonicapplication.R
import java.util.*
import javax.inject.Inject

sealed class UtilityBase {
    open class BaseFragment<T : ViewDataBinding> constructor(@LayoutRes val layoutRes: Int) :
        DialogFragment() {

        companion object {
//            var viewId: NavController? = null
        }

//        lateinit var viewModel: InitViewModel

        lateinit var binding: T

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?,
        ): View? {
            binding = DataBindingUtil.inflate(inflater, layoutRes, container, false)
            binding.onCreateView()
            binding.onViewCreated()

            return binding.root
        }

        open fun T.onCreateView() = Unit

        open fun T.onViewCreated() = Unit

        override fun onResume() {
            super.onResume()
//            viewId = NavHostFragment.findNavController(this)
        }

        fun goNextFragment(@IdRes resId: Int = R.id.homeFragment) {
            try {
                findNavController().navigate(resId)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    open class BaseAppCompatActivity<T : ViewDataBinding>(@LayoutRes val layoutRes: Int) :
        AppCompatActivity() {

//        @Inject
//        lateinit var factory: InitViewModelFactory

//        @Inject
//        lateinit var networkConnectivity: NetworkConnectivity

        lateinit var binding: T

        private var qr = ""

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
//            supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
//            setFinishOnTouchOutside(false)
            binding = DataBindingUtil.setContentView(this, layoutRes)
            binding.onCreate()
        }

        open fun T.onCreate() = Unit
    }
}