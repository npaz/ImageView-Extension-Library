package pt.mrpeace.development.animatedvector

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import pt.mrpeace.development.imageviewextension.applyLoopingAnimatedVectorDrawable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageTest.applyLoopingAnimatedVectorDrawable(R.drawable.avd_anim)
    }



}
