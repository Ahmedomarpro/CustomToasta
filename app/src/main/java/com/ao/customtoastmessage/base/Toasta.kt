package com.ao.customtoastmessage.base

import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Build
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import com.ao.customtoastmessage.R

class Toasta(private val mContext: Context) : Toast(mContext) {
    private var mView: View? = null
    private var mType = 0
    override fun setText(resId: Int) {
        setText(mContext.getString(resId))
    }

    override fun setText(s: CharSequence) {
        if (mView == null) {
            throw RuntimeException("This Toast was not created with Toast.makeText()")
        }
        val tv = mView!!.findViewById<TextView>(R.id.text)
                ?: throw RuntimeException("This Toast was not created with Toast.makeText()")
        tv.text = s
    }

    fun setIcon(@DrawableRes iconId: Int) {
        setIcon(ContextCompat.getDrawable(mContext, iconId))
    }

    fun setIcon(icon: Drawable?) {
        if (mView == null) {
            throw RuntimeException("This Toast was not created with Toast.makeText()")
        }
        val iv = mView!!.findViewById<ImageView>(R.id.icon)
                ?: throw RuntimeException("This Toast was not created with Toast.makeText()")
        iv.setImageDrawable(icon)
    }

    fun setmType(type: Int) {
        mType = type
    }

    fun getmType(): Int {
        return mType
    }

    companion object {
        const val CUSTOM_TYPE_INFO = 0
        const val CUSTOM_TYPE_WARNING = 1
        const val CUSTOM_TYPE_SUCCESS = 2
        const val CUSTOM_TYPE_ERROR = 3
        const val CUSTOM_GRAVITY_TOP = 0
        const val CUSTOM_GRAVITY_CENTER = 1
        const val CUSTOM_GRAVITY_BOTTOM = 2
        var CUSTOM_DURATION_SHORT = LENGTH_SHORT
        var CUSTOM_DURATION_LONG = LENGTH_LONG

        /*fun makeToast(context: Context, message: String, duration: Int): Toasta {
            return makeToast(context, message, duration)
        }*/
//      //  fun makeToast(context: Context, message: String?, duration: Int = CUSTOM_DURATION_SHORT, type: Int = CUSTOM_TYPE_INFO, gravity: Int = CUSTOM_GRAVITY_BOTTOM): MYToast{

         fun makeToast(context: Context, message: String?, duration: Int = CUSTOM_DURATION_SHORT, type: Int = CUSTOM_TYPE_INFO, gravity: Int = CUSTOM_GRAVITY_BOTTOM): Toasta {
            val myToast = Toasta(context)
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view = inflater.inflate(R.layout.mycustom_toast_container, null)
            val myIcon = view.findViewById<ImageView>(R.id.my_toast_icon)
            val myTextView = view.findViewById<TextView>(R.id.my_toast_textview)
            when (type) {
                CUSTOM_TYPE_ERROR -> {
                    myIcon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_error))
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                        view.background = ContextCompat.getDrawable(context, R.drawable.custom_toast_error_background)
                    } else {
                        view.setBackgroundColor(ContextCompat.getColor(context, R.color.colorError))
                    }
                }
                CUSTOM_TYPE_SUCCESS -> {
                    myIcon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_success))
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                        view.background = ContextCompat.getDrawable(context, R.drawable.custom_toast_success_background)
                    } else {
                        view.setBackgroundColor(ContextCompat.getColor(context, R.color.colorSuccess))
                    }
                }
                CUSTOM_TYPE_WARNING -> {
                    myIcon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_warning))
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                        view.background = ContextCompat.getDrawable(context, R.drawable.custom_toast_warning_background)
                    } else {
                        view.setBackgroundColor(ContextCompat.getColor(context, R.color.colorWarning))
                    }
                }
                else -> {
                    myIcon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_info))
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                        view.background = ContextCompat.getDrawable(context, R.drawable.custom_toast_info_background)
                    } else {
                        view.setBackgroundColor(ContextCompat.getColor(context, R.color.colorInfo))
                    }
                }
            }
            when (gravity) {
                CUSTOM_GRAVITY_TOP -> myToast.setGravity(Gravity.TOP, 0, 30)
                CUSTOM_GRAVITY_CENTER -> myToast.setGravity(Gravity.CENTER, 0, 30)
                else -> myToast.setGravity(Gravity.BOTTOM, 0, 30)
            }
            myTextView.text = message
            myToast.duration = duration
            myToast.view = view
            myToast.mView = view
            myToast.mType = type
            return myToast
        }

        //fun makeToast(context: Context, message: String, duration: Int, type: Int): MYToast {
        fun makeToast(context: Context, message: String, duration: Int, type: Int): Toasta {
            val myToast = Toasta(context)
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view = inflater.inflate(R.layout.mycustom_toast_container, null)
            val myIcon = view.findViewById<ImageView>(R.id.my_toast_icon)
            val myTextView = view.findViewById<TextView>(R.id.my_toast_textview)
            when (type) {
                CUSTOM_TYPE_ERROR -> {
                    myIcon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_error))
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                        view.background = ContextCompat.getDrawable(context, R.drawable.custom_toast_error_background)
                    } else {
                        view.setBackgroundColor(ContextCompat.getColor(context, R.color.colorError))
                    }
                }
                CUSTOM_TYPE_SUCCESS -> {
                    myIcon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_success))
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                        view.background = ContextCompat.getDrawable(context, R.drawable.custom_toast_success_background)
                    } else {
                        view.setBackgroundColor(ContextCompat.getColor(context, R.color.colorSuccess))
                    }
                }
                CUSTOM_TYPE_WARNING -> {
                    myIcon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_warning))
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                        view.background = ContextCompat.getDrawable(context, R.drawable.custom_toast_warning_background)
                    } else {
                        view.setBackgroundColor(ContextCompat.getColor(context, R.color.colorWarning))
                    }
                }
                else -> {
                    myIcon.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.ic_info))
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                        view.background = ContextCompat.getDrawable(context, R.drawable.custom_toast_info_background)
                    } else {
                        view.setBackgroundColor(ContextCompat.getColor(context, R.color.colorInfo))
                    }
                }
            }
            myTextView.text = message
            myToast.duration = duration
            myToast.view = view
            myToast.mView = view
            myToast.mType = type
            return myToast
        }
    }

}