package mortlust.steigt.listenervarianten

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mortlust.steigt.listenervarianten.databinding.ActivityMainBinding
//import android.view.LayoutInflater
import android.view.View

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var B: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        B = ActivityMainBinding.inflate(layoutInflater)
        setContentView(B.root)

        B.buOne.setOnClickListener(this)
        B.buTwo.setOnClickListener(this)

        val mDrei = MyListenerClass()
        B.buThree.setOnClickListener(mDrei)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            B.buOne.id -> B.tvOutput.text = getString(R.string.buOneName)
            B.buTwo.id -> B.tvOutput.text = getString(R.string.buTwoName)
        }
    }

}