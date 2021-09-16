package com.hlq.androidanimationpro.pro

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.View
import android.view.animation.*
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
            val animationDrawable = background as AnimationDrawable
            animationDrawable.start()
        }
    }

    /**
     * 旋转动画
     */
    fun onRotateClick(view: View) {
        val rotateAnimation = RotateAnimation(0f, 360f).apply {
            duration = 1800
        }
        binding.ivTweenRotate0.startAnimation(rotateAnimation)

        binding.ivTweenRotate1.apply {
            val rotateAnim =
                AnimationUtils.loadAnimation(this@AnimationListActivity, R.anim.anim_rotate)
            startAnimation(rotateAnim)
        }
    }

    /**
     * 渐变动画
     */
    fun onAlphaClick(view: View) {
        val alphaAnimation = AlphaAnimation(0f, 1f).apply {
            duration = 1800
        }
        binding.ivTweenAlpha0.startAnimation(alphaAnimation)

        binding.ivTweenAlpha1.apply {
            AnimationUtils.loadAnimation(this@AnimationListActivity, R.anim.anim_alpha).apply {
                startAnimation(this)
                setAnimationListener(object : Animation.AnimationListener {

                    /**
                     * 动画开始
                     */
                    override fun onAnimationStart(animation: Animation?) {

                    }

                    /**
                     * 动画结束
                     */
                    override fun onAnimationEnd(animation: Animation?) {

                    }

                    /**
                     * 动画重复播放
                     */
                    override fun onAnimationRepeat(animation: Animation?) {

                    }

                })
            }
        }
    }

    /**
     * 缩放动画
     */
    fun onScaleClick(view: View) {
        val scaleAnimation = ScaleAnimation(1f, 1.2f, 1f, 1.2f).apply {
            duration = 1800
        }
        binding.ivTweenScale0.startAnimation(scaleAnimation)

        binding.ivTweenScale1.apply {
            AnimationUtils.loadAnimation(this@AnimationListActivity, R.anim.anim_scale).apply {
                startAnimation(this)
            }
        }
    }

    /**
     * 平移动画
     */
    fun onTranslateClick(view: View){
        val translateAnimation = TranslateAnimation(0f,100f,0f,100f).apply {
            duration = 3600
            fillAfter = true // 动画结束后不回到原地
        }
        binding.ivTweenTranslate0.startAnimation(translateAnimation)

        binding.ivTweenTranslate1.apply {
            AnimationUtils.loadAnimation(this@AnimationListActivity, R.anim.anim_translate).apply {
                startAnimation(this)
            }
        }
    }

}