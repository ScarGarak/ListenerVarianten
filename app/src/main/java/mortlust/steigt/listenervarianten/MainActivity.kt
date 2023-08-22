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

        B.buFour.setOnClickListener(MyListenerObject)

        /*
         * anonymous singleton-object with reference
         *
         * val mFive = object: View.OnClickListener {
         *     override fun onClick(v: View?) {
         *         B.tvOutput.text = getString(R.string.buFiveName)
         *     }
         * }
         *
         * as lambda expression
         */
        //val mFive = View.OnClickListener { B.tvOutput.text = "5" }
        val mFive = View.OnClickListener { B.tvOutput.text = getString(R.string.buFiveName) }
        B.buFive.setOnClickListener(mFive)

        /*
         * anonymous singleton-object without reference
         */
        B.buSix.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                B.tvOutput.text = getString(R.string.buSixName)
            }
        })


    }

    override fun onClick(v: View?) {
        when (v?.id) {
            B.buOne.id -> B.tvOutput.text = getString(R.string.buOneName)
            B.buTwo.id -> B.tvOutput.text = getString(R.string.buTwoName)
        }
    }

}