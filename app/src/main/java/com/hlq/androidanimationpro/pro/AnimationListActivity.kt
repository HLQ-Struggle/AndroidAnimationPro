package com.hlq.androidanimationpro.pro

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hlq.androidanimationpro.R
import com.hlq.androidanimationpro.databinding.ActivityAnimationListBinding

/**
 * @author HLQ_Struggle
 * @date 2021/9/13
 * @desc 视觉动画
 */
class AnimationListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAnimationListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAnimationListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {

        startFrameAnim()

    }

    /**
     * 帧动画
     */
    private fun startFrameAnim() {
        binding.ivFrameAnim.apply {
            setBackgroundResource(R.drawable.animation_rabbit)
            val animationDrawable = drawable as AnimationDrawable
            animationDrawable.start()
        }
    }

}