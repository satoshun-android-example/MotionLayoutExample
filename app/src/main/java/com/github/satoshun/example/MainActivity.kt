package com.github.satoshun.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.MotionScene
import androidx.core.view.doOnLayout
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.main_act.*

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main_act)

    Glide.with(this)
      .load("https://pbs.twimg.com/profile_images/1108958487801786368/wwk-3ysJ_400x400.jpg")
      .into(left)

    Glide.with(this)
      .load("https://pbs.twimg.com/profile_images/1108958487801786368/wwk-3ysJ_400x400.jpg")
      .into(right)

    root.setTransitionListener(object : MotionLayout.TransitionListener {
      override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {
      }

      override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {
      }

      override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {
      }

      override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
      }

      override fun allowsTransition(p0: MotionScene.Transition?): Boolean {
        return true
      }
    })

    root.doOnLayout {
      root.transitionToEnd()
    }
  }
}
